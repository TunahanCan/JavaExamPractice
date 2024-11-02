package com.ocp.chapter13.creat_thread_concurincy_api.increasing_concurrency_with_pools;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSchedulerExampleV1 {

    public static void main(String[] args) {

        var service = Executors.newScheduledThreadPool(3);

        Runnable task1 = () -> {
            System.out.println("Executing the task1 , Thread#name " + Thread.currentThread().getName() + ", " + LocalTime.now());
        };

        Runnable task2 = () -> {
            System.out.println("Executing the task2 , Thread#name " + Thread.currentThread().getName() + ", " + LocalTime.now());
        };

        Runnable task3 = () -> {
            System.out.println("Executing the task3 , Thread#name " + Thread.currentThread().getName() + ", " + LocalTime.now());
        };

        service.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(task2, 0, 2, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(task3, 0, 2, TimeUnit.SECONDS);
        System.out.println("Thread main finished");
    }
}
