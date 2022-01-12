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
    public String sendTestMessage(String test) {
        for (int i = 0; i < 100; i++) {
            template.send("Test-Message", "Test-Message" + i);
        }
        return "sucessful";
    }

    @Autowired
    public void setTemplate(KafkaTemplate<String, Object> template) {
        this.template = template;
    }
}
