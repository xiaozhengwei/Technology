package com.utunan.kafka.learning;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

import static java.lang.Thread.sleep;


public class ConsumerFastStart {

    public static final String brokerList = "kafka.utunan.com:9092";

    public static final String topic = "topic-demo";

    public static final String groupId="group.demo";

    public static void main(String[] args) throws InterruptedException {
        Properties properties = new Properties();
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("bootstrap.servers",brokerList) ;
        properties.put("group.id",groupId);
        KafkaConsumer<String,String> consumer=new KafkaConsumer<String, String>(properties);
        consumer.subscribe(Collections.singleton(topic));
        while (true){
            ConsumerRecords<String,String> records=consumer.poll(Duration.ofMillis(1000));
            for(ConsumerRecord<String,String> record:records){
                System.out.println(record);
            }
            sleep(5000);
        }
    }

}
