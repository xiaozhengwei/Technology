package com.utunan.kafka.learning;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

public class KafkaConsumerAnalysis {
    public static final String brokerList = "kafka.utunan.com:9092";
    public static final String topic = "topic-demo";
    public static final String groupid = "group.demo";
    public static final AtomicBoolean isRunning = new AtomicBoolean(true);

    public static Properties initConfig() {
        Properties props = new Properties();
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerList);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupid);
        props.put(ConsumerConfig.CLIENT_ID_CONFIG, "client.id.demo");
        return props;
    }

    public static void main(String[] args) {
        Properties props = initConfig();
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(List.of(topic));
        System.out.println("开始消费消息:");
        int count=0;
        try {
            while (isRunning.get()) {
                ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
                for (ConsumerRecord<String, String> record : records) {
                    System.out.println("第"+(++count)+"条消息:");
                    System.out.println("topic =" + record.topic() + ", partition = " + record.partition() + ", offset=" + record.offset());
                    System.out.println("key =" + record.key() + ", value=" + record.value());
                }
            }
        } catch (Exception e) {
        } finally {
            consumer.close();
        }
    }

}
