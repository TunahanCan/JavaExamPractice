package com.ocp.chapter13.creat_thread_concurincy_api.schedulling_tasks;

import java.time.LocalTime;
import java.util.concurrent.*;

public class ThreadSchedulerExampleV3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var service = Executors.newSingleThreadScheduledExecutor();
        Callable<String> task1 = () -> {
            LocalTime now = LocalTime.now();
            System.out.println("Task time: " + now);
            return "Hello message";
        } ;

        LocalTime time = LocalTime.now();
        System.out.println("Before calling task time: " + time);
        ScheduledFuture<String> run = service.schedule(task1, 5 , TimeUnit.SECONDS);
        System.out.println(run.get());
        service.shutdown();
    }
}
