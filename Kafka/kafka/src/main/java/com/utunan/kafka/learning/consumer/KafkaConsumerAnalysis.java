package com.utunan.kafka.learning.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

public class KafkaConsumerAnalysis {

    public static final String brokerList = "kafka.utunan.com:9092";
    public static final String topic = "topic-demo";
    public static final String groupId = "group.demo";
    public static final String clientId = "group.demo";

    public static final AtomicBoolean isRunning = new AtomicBoolean(true);

    public static Properties initConfig() {

        Properties properties = new Properties();
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerList);
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        // 自动提交
        //properties . put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG , false);
        properties.put(ConsumerConfig.CLIENT_ID_CONFIG, clientId);
        return properties;
    }

    public static void main(String[] args) {

        Properties props = initConfig();

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);

        consumer.subscribe(List.of(topic));

        System.out.println("开始消费消息:");

        int count = 0;
        try {
            while (isRunning.get()) {
                ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
                for (ConsumerRecord<String, String> record : records) {
                    System.out.println("第" + (++count) + "条消息:");
                    System.out.println("topic =" + record.topic() + ", partition = " + record.partition() + ", offset=" + record.offset());
                    System.out.println("key =" + record.key() + ", value=" + record.value());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
