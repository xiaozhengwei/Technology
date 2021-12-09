package com.utunan.rocketmq.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.MQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;

@Slf4j
@RestController
@RequestMapping("send")
public class SendMessageController {

    private RocketMQTemplate rocketMQTemplate;

    @Autowired
    public void setRocketMQTemplate(RocketMQTemplate rocketMQTemplate) {
        this.rocketMQTemplate = rocketMQTemplate;
    }

    @RequestMapping("test")
    public String sendTestMessage() {
        int messageNum = 100;
        CountDownLatch countDownLatch = new CountDownLatch(messageNum);
        String topic = "TopicTest";
        try {
            for (int i = 0; i < messageNum; i++) {
                String message = "第" + i + "条消息";
                MQProducer producer = rocketMQTemplate.getProducer();
                // rocketMQTemplate.convertAndSend(topic,message);
                // rocketMQTemplate.sendOneWay(topic,message);
                // rocketMQTemplate.sendAndReceive()
                // rocketMQTemplate.syncSend();
                // rocketMQTemplate.syncSendOrderly();
                // rocketMQTemplate.asyncSend();
                // rocketMQTemplate.asyncSendOrderly();
                // rocketMQTemplate.sendOneWay();
                // rocketMQTemplate.sendOneWayOrderly();
                // Message info = new Message(topic, "Tag", "demo", message.getBytes(StandardCharsets.UTF_8));
                //info.setDelayTimeLevel(1);
                rocketMQTemplate.asyncSend(topic, message, new SendCallback() {
                    @Override
                    public void onSuccess(SendResult sendResult) {
                        countDownLatch.countDown();
                        log.info("消息发送成功，消息为==>" + message);
                    }

                    @Override
                    public void onException(Throwable throwable) {
                        countDownLatch.countDown();
                        log.info("消息发送失败，消息为==>" + message);
                    }
                });


            }
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "successful";
    }


}
