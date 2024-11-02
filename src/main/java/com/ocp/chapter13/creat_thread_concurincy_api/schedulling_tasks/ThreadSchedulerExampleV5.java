package com.ocp.chapter13.creat_thread_concurincy_api.schedulling_tasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadSchedulerExampleV5 {

    private static int counter = 0;

    public static void main(String[] args) {
        var service = Executors.newSingleThreadScheduledExecutor();
        Runnable task = () -> {
            LocalTime now = LocalTime.now();
            System.out.println("task time: " + now);
            System.out.println("counter: " + ++counter);

            try {
                Thread.sleep(40000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } ;


        LocalTime now2 = LocalTime.now();
        System.out.println("before task time: " + now2);
        service.scheduleAtFixedRate(task, 2, 6 , TimeUnit.SECONDS);


    }
}
