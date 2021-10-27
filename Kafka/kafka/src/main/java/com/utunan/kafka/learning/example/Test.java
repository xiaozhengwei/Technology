package com.utunan.kafka.learning.example;


import java.util.concurrent.atomic.LongAdder;

public class Test {
    public static void main(String[] args) {

        LongAdder longAdder = new LongAdder();
        longAdder.add(1L);
        longAdder.add(1L);
        longAdder.add(1L);
        longAdder.add(1L);
        longAdder.increment();
        longAdder.longValue();


    }
}
