package com.utunan.redission.controller;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("lock")
public class LockController {

    @Resource
    private RedissonClient redissonClient;

    @RequestMapping("v1")
    public String lockV1() {
        RLock lock = redissonClient.getLock("v1-lock");

        lock.lock();


        lock.unlock();


        return "successful";
    }

}
