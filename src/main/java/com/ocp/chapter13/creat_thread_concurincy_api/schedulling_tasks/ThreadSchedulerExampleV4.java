package com.ocp.chapter13.creat_thread_concurincy_api.schedulling_tasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadSchedulerExampleV4 {

    private static int counter = 0;

    public static void main(String[] args) {
        var service = Executors.newSingleThreadScheduledExecutor();
        Runnable task = () -> {
            LocalTime now = LocalTime.now();
            System.out.println("Task time: " + now);
            System.out.println("Counter: " +  ++counter);
        };

        LocalTime start = LocalTime.now();
        System.out.println("Start time: " + start);
        service.scheduleAtFixedRate(task, 3 , 5, TimeUnit.SECONDS);
    }
}
