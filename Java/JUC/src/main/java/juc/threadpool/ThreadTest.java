package juc.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadTest {

    class MyThread extends Thread {

        @Override
        public void run() {
            String str=new String("123123");
            System.out.println("执行啦~~");

        }
    }


    public static void main(String[] args) {

        Thread main=Thread.currentThread();
        System.out.println("start");
        Thread thread=new Thread();
        ThreadGroup tg=thread.getThreadGroup();

        System.out.println(tg);
        System.out.println("end");

    }

}
