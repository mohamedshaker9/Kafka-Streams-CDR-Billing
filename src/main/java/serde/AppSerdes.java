package serde;


import com.cdr.*;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.common.serialization.Serdes;

import java.util.HashMap;
import java.util.Map;

public class AppSerdes extends Serdes {

    private static final String SCHEMA_REGISTRY_URL = "http://localhost:8081";
//private static final String  SCHEMA_REGISTRY_URL = "http://192.168.73.167:8081";



    public static SpecificAvroSerde<CurrentQuantityBalanceCompositeKey> CurrentQuantityBalanceCompositeKey() {
        SpecificAvroSerde<CurrentQuantityBalanceCompositeKey> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, true);

        return serde;
    }

    public static SpecificAvroSerde<CurrentQuantityBalance> CurrentQuantityBalance() {
        SpecificAvroSerde<CurrentQuantityBalance> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<NotBilledRatedCDR> NotBilledRatedCDR() {
        SpecificAvroSerde<NotBilledRatedCDR> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<BilledRatedCDR> BilledRatedCDR() {
        SpecificAvroSerde<BilledRatedCDR> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<BilledRatedCDRCurrentQuantityBalance> BilledRatedCDRCurrentQuantityBalance() {
        SpecificAvroSerde<BilledRatedCDRCurrentQuantityBalance> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<RatedCDR> RatedCDR() {
        SpecificAvroSerde<RatedCDR> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }


    }