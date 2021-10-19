package com.utunan.kafka.learning;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class KafkaProducerAnalysis {
    public static final String brokerList = "kafka.utunan.com:9092";

    public static final String topic = "topic-demo";

    public static Properties initConfig() {
        Properties props = new Properties();
        props.put("bootstrap.servers", brokerList);
        props.put("key.serializer",
                "org.apache.kafka.common.serialization.S七ringSerializer");
        props.put("value.serializer",
                "org.apache.kafka.common.serialization.S七ringSerializer");
        props.put("client. id", "producer. client. id. demo");
        return props;
    }
    public static void main(String[] args) {
        Properties props = initConfig();
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
        ProducerRecord<String, String> record =
                new ProducerRecord<>(topic, "hello, Kafka1 ");
        try {
            producer.send(record);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
