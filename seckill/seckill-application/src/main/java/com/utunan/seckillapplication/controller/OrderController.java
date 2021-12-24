package com.utunan.seckillapplication.controller;

import com.utunan.common.domain.model.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {


    @RequestMapping("create")
    public ResponseResult<String> createOrder() {

        return ResponseResult.newInstance(ResponseResult.ResponseCode.SUCCESS, null, "Hello");
    }
}
