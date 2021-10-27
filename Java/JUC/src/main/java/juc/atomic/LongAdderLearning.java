package juc.atomic;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderLearning {

    public final static LongAdder longAdder = new LongAdder();

    @Test
    public void test(){
        int a=Runtime.getRuntime().availableProcessors();
        System.out.println(a);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountDownLatch countDownLatch = new CountDownLatch(20);
        for (int i = 0; i < 200; i++) {
            executorService.submit(() -> {
                try {
                    for (int j = 0; j < 1000; j++) {
                        System.out.println(Thread.currentThread().getName()+"==第"+j+"次==start===="+longAdder.sum());
                        longAdder.add(1);
                        System.out.println(Thread.currentThread().getName()+"==第"+j+"次==end===="+longAdder.sum());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
