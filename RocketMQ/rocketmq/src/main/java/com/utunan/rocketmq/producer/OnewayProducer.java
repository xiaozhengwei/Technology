package com.utunan.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.StandardCharsets;

public class OnewayProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException {

        DefaultMQProducer producer = new DefaultMQProducer("OneWayProducer");

        producer.setNamesrvAddr("180.76.100.50:9876");

        producer.start();

        for (int i = 0; i < 100; i++) {
            Message message = new Message("OneWayProducer", "TAG1", "KEY" + i, ("Hello" + i).getBytes(StandardCharsets.UTF_8));
            producer.sendOneway(message);
        }

        producer.shutdown();

    }
}
