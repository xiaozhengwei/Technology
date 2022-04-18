package com.utunan.shardingjdbc.service.impl;

import com.utunan.shardingjdbc.domain.entity.Order;
import com.utunan.shardingjdbc.mapper.OrderMapper;
import com.utunan.shardingjdbc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    public OrderMapper orderMapper;

    @Override
    public void save(Order order){
        orderMapper.save(order);
    }
}
