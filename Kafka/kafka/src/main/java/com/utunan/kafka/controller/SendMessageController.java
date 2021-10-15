package com.utunan.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send/message")
public class SendMessageController {


    private KafkaTemplate<String, Object> template;

    @RequestMapping("test")
    public String sendTestMessage() {
        template.send("test", "test");
        return "successful";
    }

    @Autowired
    public void setTemplate(KafkaTemplate<String, Object> template) {
        this.template = template;
    }
}
