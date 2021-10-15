package com.utunan.rocketmq.controller;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send")
public class SendMessageController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("test")
    public String sendTestMessage() {
        rocketMQTemplate.convertAndSend("TopicTest", "这是一条测试消息");
        return "successful";
    }


}
