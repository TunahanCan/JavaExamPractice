package com.ocp.chapter13.creat_thread_concurincy_api.schedulling_tasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadSchedulerExampleV2 {

    public static void main(String[] args) {
        var  service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> {
            LocalTime time = LocalTime.now();
            System.out.println("Task Time: " + time);
            System.out.println("hello");
        } ;
        LocalTime time = LocalTime.now();
        System.out.println("Before schedule: " + time);
        ScheduledFuture<?> run = service.schedule(task1, 5, TimeUnit.SECONDS);
        service.shutdown();
    }
}
