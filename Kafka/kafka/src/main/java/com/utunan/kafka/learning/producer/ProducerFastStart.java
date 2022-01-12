package com.utunan.kafka.learning.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class ProducerFastStart {

    public static final String brokerList = "kafka1:9092,kafka2:9092,kafka3:9092";

    public static final String topic = "topic-demo";

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerList);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);


        int i = 0;
        while (true) {
            try {
                ProducerRecord<String, String> record = new ProducerRecord<>(topic, "Hello Kafka!===" + i);
                producer.send(record);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }

        producer.close();

    }

}
