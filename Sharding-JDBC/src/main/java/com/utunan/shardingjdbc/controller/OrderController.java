package com.utunan.shardingjdbc.controller;

import com.utunan.shardingjdbc.domain.entity.Order;
import com.utunan.shardingjdbc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @RequestMapping("save")
    public String save(Order order) {
        orderService.save(order);
        return order.toString();
    }

}
