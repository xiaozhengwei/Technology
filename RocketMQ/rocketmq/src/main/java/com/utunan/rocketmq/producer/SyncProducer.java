package com.utunan.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.StandardCharsets;

public class SyncProducer {
    public static void main(String[] args) throws MQBrokerException, RemotingException, InterruptedException, MQClientException {

        DefaultMQProducer producer = new
                DefaultMQProducer("SyncProducer");
        // Specify name server addresses.
        producer.setNamesrvAddr("180.76.100.50:9876");
        producer.start();
        for (int i = 0; i < 100; i++) {
            Message message = new Message("SyncTopic", "TAG1", "KEY1", ("Hello" + i).getBytes(StandardCharsets.UTF_8));
            SendResult sendResult = producer.send(message);
            System.out.printf("%s%n", sendResult);
        }

        producer.shutdown();

    }
}
