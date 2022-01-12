package com.utunan.kafka.learning.producer;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.Future;

public class KafkaProducerAnalysis {
    public static final String brokerList = "kafka1:9092,kafka2:9092,kafka3:9092";

    public static final String topic = "topic-demo";

    public static Properties initConfig() {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", brokerList);
        properties.put("key.serializer",
                StringSerializer.class.getName());
        properties.put("value.serializer",
                StringSerializer.class.getName());
        properties.put("client.id", "producer.client.id.demo");
        // 重试次数
        properties.put(ProducerConfig.RETRIES_CONFIG, 10);
        // 设置拦截器
        // props.put(ProducerConfig.INTERCEPTOR_CLASSES_CONFIG ,ProducerInterceptorPrefix.class.getName());
        // 设置ack 默认值为1
        // properties.put(ProducerConfig.ACKS_CONFIG, "0");
        return properties;
    }

    public static void main(String[] args) {
        Properties props = initConfig();
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
        ProducerRecord<String, String> record =
                new ProducerRecord<>(topic, "hello, Kafka , KafkaProducerAnalysis");
        try {
            Future<RecordMetadata> recordMetadataFuture = producer.send(record);
            RecordMetadata recordMetadata = recordMetadataFuture.get();
            System.out.println(recordMetadata.toString());


            producer.send(record, new Callback() {
                @Override
                public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                    if (e != null) {
                        e.printStackTrace();
                    } else {
                        System.out.println(recordMetadata.toString());
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
