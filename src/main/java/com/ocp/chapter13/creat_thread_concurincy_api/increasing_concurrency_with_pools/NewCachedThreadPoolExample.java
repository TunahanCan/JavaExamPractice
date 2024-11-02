package com.ocp.chapter13.creat_thread_concurincy_api.increasing_concurrency_with_pools;

import java.util.concurrent.Executors;

public class NewCachedThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        var executorService = Executors.newCachedThreadPool();
        Runnable task = () -> System.out.println("Task1 , " + Thread.currentThread().getName());
        for (int i = 0; i < 1_000; i++) {
            executorService.submit(task);
        }
        executorService.shutdown();
    }
}
