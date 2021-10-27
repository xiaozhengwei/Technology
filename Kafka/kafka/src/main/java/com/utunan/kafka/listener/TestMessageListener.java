package com.utunan.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Component
public class TestMessageListener {

    @KafkaListener(id = "test-group", topics = "test")
    public void receiveTestMessage(ConsumerRecord<Integer, String> record) throws InterruptedException {
        System.out.println(record);
    }
}
