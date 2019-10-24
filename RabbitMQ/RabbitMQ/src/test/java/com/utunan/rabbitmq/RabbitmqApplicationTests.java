package com.utunan.rabbitmq;


import com.utunan.rabbitmq.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private AmqpAdmin amqpAdmin;

    /**
     * 1、单播 (点对点)
     */
    @Test
    public void contextLoads() {
        //  Message需要自己定义
        //  定义消息体内容和消息头
        //  rabbitTemplate.send(exchange,routeKey,message);

        //  Object默认当成消息体 , 只需要传入要发送的对象 , 自动序列化发送给 rabbitmq
        //  rabbitTemplate.convertAndSend(exchange,routeKey,object);

        Map<String,Object> map =new HashMap<>();
        map.put("msg","这是第一个消息");
        map.put("data", Arrays.asList("Hello",123,true));

        rabbitTemplate.convertAndSend("exchange.direct","atguigu.news",map);

    }

    @Test
    public void receive(){
       Object o= rabbitTemplate.receiveAndConvert("atguigu.news");
        System.out.println(o.getClass());
        System.out.println(o);
    }

    @Test
    public  void sendMsg(){
        rabbitTemplate.convertAndSend("exchange.fanout","",new Book("红楼梦","曹雪芹"));

    }

    @Test
    public  void createExchange(){
        amqpAdmin.declareExchange(new DirectExchange("amqpAdmin.exchange"));
        System.out.println("创建Exchange完成");
    }

    @Test
    public void createQueue(){
        amqpAdmin.declareQueue(new Queue("amqpAdmin.queue",true));
    }

}
