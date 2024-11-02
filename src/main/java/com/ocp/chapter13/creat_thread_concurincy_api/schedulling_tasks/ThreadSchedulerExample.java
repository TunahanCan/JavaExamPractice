package com.ocp.chapter13.creat_thread_concurincy_api.schedulling_tasks;


import java.util.concurrent.*;

public class ThreadSchedulerExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("hello zero");
        Callable<String> task2 = () -> "monkey";

        ScheduledFuture<?> run1 = service.schedule(task1,2, TimeUnit.SECONDS);
        ScheduledFuture<?> run2 = service.schedule(task2,4, TimeUnit.SECONDS);

        System.out.println(run1.get());
        System.out.println(run2.get());
    }
}
