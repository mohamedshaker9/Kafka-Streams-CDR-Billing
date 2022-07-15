public abstract class AppConfigs {
    public static final String APP_NAME = "CDRBillingApp4";
    public static final String BROKERS = "localhost:9092,localhost:9093,localhost:9094";
//    public static final String  BROKERS = "192.168.73.167:9092,192.168.73.167:9093,192.168.73.167:9094";


    public static final String SINK_TOPIC_BILLED_RATED_CDR = "sink-topic-billed-rated-cdr";
    public static final String SINK_TOPIC_NEW_CURRENT_QUANTITY_BALANCE = "sink-topic-new-current-quantity-balance";

    //Created By Default By KafkaConnect Source
    public static final String SOURCE_TOPIC_NOT_BILLED_RATED_CDR = "source2-topic-not-billed-rated-cdrs";
    public static final String SOURCE_TOPIC_CURRENT_QUANTITY_BALANCE = "source-topic-current_quantity_balance";
}


