package juc.threadpool;

import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(
                        1,
                        2,
                        1,
                        TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<>(),
                        new ThreadPoolExecutor.DiscardOldestPolicy()
                );

        ExecutorService executor= Executors.newSingleThreadExecutor();

    }
}
