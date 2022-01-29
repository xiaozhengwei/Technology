package com.utunan.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@RestController
@RequestMapping("send/message")
public class SendMessageController {


    private KafkaTemplate<String, Object> kafkaTemplate;


    @RequestMapping("test")
    public void sendTestMessage(String test) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(new File("D://picture.jpg")));
        StringBuilder sb = new StringBuilder();
        String result;
        while ((result = fileReader.readLine()) != null) {
            sb.append(result);
        }
        for (int i = 0; i < 100; i++) {
            ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send("Test-Message", sb.toString());
            future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
                @Override
                public void onSuccess(SendResult<String, Object> result) {
                    System.out.println("msg OK." + result.toString());
                }

                @Override
                public void onFailure(Throwable ex) {
                    System.out.println("msg send failed ");
                }
            });
        }

    }

    @Autowired
    public void setTemplate(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
}
