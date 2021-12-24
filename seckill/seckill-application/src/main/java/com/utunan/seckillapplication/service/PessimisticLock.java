package com.utunan.seckillapplication.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PessimisticLock {


    @Transactional()
    public void run(){

    }
}
