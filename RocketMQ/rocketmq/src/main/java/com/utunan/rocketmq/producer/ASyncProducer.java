package com.utunan.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ASyncProducer {
    public static void main(String[] args) throws MQBrokerException, RemotingException, InterruptedException, MQClientException {

        DefaultMQProducer producer = new
                DefaultMQProducer("AsyncProducer");
        // Specify name server addresses.
        producer.setNamesrvAddr("180.76.100.50:9876");
        producer.start();
        int messageNum = 100;
        CountDownLatch countDownLatch = new CountDownLatch(messageNum);
        for (int i = 0; i < messageNum; i++) {
            final int index = i;
            Message message = new Message("AsyncTopic", "TAG1", "KEY1", ("Hello" + i).getBytes(StandardCharsets.UTF_8));
            producer.send(message, new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
                    countDownLatch.countDown();
                    System.out.printf("%-10d OK %s %n", index,
                            sendResult.getMsgId());
                }

                @Override
                public void onException(Throwable e) {
                    countDownLatch.countDown();
                    System.out.printf("%-10d Exception %s %n", index, e);
                    e.printStackTrace();
                }
            });
        }
        countDownLatch.await(20, TimeUnit.SECONDS);
        producer.shutdown();

    }
}
