package com.utunan.seckillapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("seckill")
public class SeckillController {

    @RequestMapping("/db/pessimistic/lock/v1")
    public Map<String, String> seckill(String id) {
        Map<String, String> result = new HashMap<>();



        return result;
    }

}
