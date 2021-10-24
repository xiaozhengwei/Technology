package com.utunan.redission.controller;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("lock")
public class LockController {

    @Resource
    private RedissonClient redissonClient;

    @RequestMapping("v1")
    public String lockV1() throws InterruptedException {
        RLock v1Lock = redissonClient.getLock("v1-lock");

        try {
            boolean isLock = v1Lock.tryLock();
            if (isLock) {
                System.out.println("666");
            } else {
                System.out.println("No 666");
            }
            Thread.sleep(10000L);
        } catch (Exception e) {

        } finally {
            v1Lock.unlock();
        }
        return "successful";
    }

}
