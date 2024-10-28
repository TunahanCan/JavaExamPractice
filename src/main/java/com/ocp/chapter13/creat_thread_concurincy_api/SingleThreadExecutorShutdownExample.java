package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorShutdownExample {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("printing records" + i);
            }
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        try{
            System.out.println("begin");
            service.execute(runnable);
            System.out.println("end");
        } finally {
            service.shutdown();
            System.out.println("service is shutdown :" + service.isShutdown());
            System.out.println("service is terminated :" + service.isTerminated());
        }

        service.execute(runnable);
    }
}
