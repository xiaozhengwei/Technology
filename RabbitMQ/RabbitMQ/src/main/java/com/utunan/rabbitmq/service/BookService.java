package com.utunan.rabbitmq.service;

import com.utunan.rabbitmq.entity.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @RabbitListener(queues = "utunan.news")
    public void receive(Book book){
        System.out.println("收到消息: " +book);
    }

    @RabbitListener(queues = "utunan")
    public void receive(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
