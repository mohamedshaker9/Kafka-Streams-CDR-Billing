import com.cdr.*;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.metrics.stats.Rate;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import serde.AppSerdes;

import java.util.Date;
import java.util.Properties;

public class CDRBillingApp {
    private static final Logger logger = LogManager.getLogger(CDRBillingApp.class);

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, AppConfigs.APP_NAME);
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.BROKERS);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 0);

        StreamsBuilder streamsBuilder = new StreamsBuilder();

        KStream<CurrentQuantityBalanceCompositeKey, RatedCDR> notBilledRatedCdrKStream =
                streamsBuilder.stream(AppConfigs.SOURCE_TOPIC_NOT_BILLED_RATED_CDR,
                        Consumed.with(AppSerdes.CurrentQuantityBalanceCompositeKey(), AppSerdes.RatedCDR()));
        notBilledRatedCdrKStream
                .filter((k, v) -> v.getIsBilled() == 0)
                .peek((k, v)-> System.out.println("Not Billed Rated CDR - key: " + k + " value: " + v ));

        KTable<CurrentQuantityBalanceCompositeKey, CurrentQuantityBalance> currentQuantityBalanceKTable =
                streamsBuilder.table(AppConfigs.SOURCE_TOPIC_CURRENT_QUANTITY_BALANCE,
                        Consumed.with(AppSerdes.CurrentQuantityBalanceCompositeKey(), AppSerdes.CurrentQuantityBalance()));
        currentQuantityBalanceKTable.toStream().peek((k, v)-> System.out.println("Current Quantity Balance - key: " + k + " value: " + v ));

       KStream<CurrentQuantityBalanceCompositeKey, BilledRatedCDRCurrentQuantityBalance> ratedCurrentJoinedKStream =
               notBilledRatedCdrKStream.join(currentQuantityBalanceKTable,
                (ratedCDR,currentQuantityBalance ) -> {
                    return BuildJoinClasses.getRatedBilledJoined(ratedCDR, currentQuantityBalance);
                });

        ratedCurrentJoinedKStream
               .mapValues((k, v) ->
                       RatedCDR.newBuilder()
                               .setCdrID(v.getCdrID())
                               .setMSISDNA(k.getMSISDN())
                               .setMSISDNB(v.getMSISDNB())
                               .setRate(v.getRate())
                               .setServiceName(v.getServiceName())
                               .setIsBilled(1)
                               .setQuantityTypeID(k.getQuantityTypeID())
                               .setCallTime(v.getCallTime())
                               .setDurationInSeconds(v.getDurationInSeconds())
                               .build()

               )
               .peek((k, v)-> System.out.println("Billed Rated CDR - key: " + k + " value: " + v ))
               .to(AppConfigs.SINK_TOPIC_BILLED_RATED_CDR,
                        Produced.with(AppSerdes.CurrentQuantityBalanceCompositeKey(), AppSerdes.RatedCDR()));

        ratedCurrentJoinedKStream
                .mapValues((k, v) ->
                        CurrentQuantityBalance.newBuilder()
                                .setMSISDN(k.getMSISDN())
                                .setQuantityTypeID(k.getQuantityTypeID())
                                .setCurrentBalance(v.getCurrentBalance())
                                .setExpirationDate(v.getExpirationDate())
                                .setLastUpdate(new Date().toInstant())
                                .build()
                )
                .peek((k, v)-> System.out.println("new Current quantity- key: " + k + " value: " + v ))
                .to(AppConfigs.SINK_TOPIC_NEW_CURRENT_QUANTITY_BALANCE,
                        Produced.with(AppSerdes.CurrentQuantityBalanceCompositeKey(), AppSerdes.CurrentQuantityBalance()));


        KafkaStreams streams = new KafkaStreams(streamsBuilder.build(), props);
        logger.info("******** Starting Streams*****");
        streams.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Stopping Streams");
            streams.close();
        }));


    }
}
