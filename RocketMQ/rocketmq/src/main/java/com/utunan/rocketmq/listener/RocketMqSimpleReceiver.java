package com.utunan.rocketmq.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(
        topic = "TopicTest",
        consumerGroup = "demo-consumer-simple"
)
public class RocketMqSimpleReceiver implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("simple:" + s);
    }
}