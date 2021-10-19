package com.utunan.kafka.learning;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class ProducerFastStart {

    public static final String brokerList = "kafka.utunan.com:9092";

    public static final String topic = "topic-demo";

    /*
          key-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: org.apache.kafka.common.serialization.StringSerializer
     */
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("bootstrap.servers",brokerList) ;
        KafkaProducer<String,String> producer=new KafkaProducer<String, String>(properties);

        ProducerRecord<String,String> record=new ProducerRecord<>(topic,"Hello Kafka!");
        try{
            producer.send(record);
        }catch (Exception e){
            e.printStackTrace();
        }
        producer.close();
    }

}
