package com.utunan.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestMessageListener {

    @KafkaListener(id = "test-group", topics = "Test-Message")
    public void receiveTestMessage(ConsumerRecord<Integer, String> record) throws InterruptedException {
        System.out.println(record);
    }
}
