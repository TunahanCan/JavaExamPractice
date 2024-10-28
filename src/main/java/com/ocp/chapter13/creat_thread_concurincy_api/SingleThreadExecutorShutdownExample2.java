package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorShutdownExample2 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("priting records : " + i);
            }
        };
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(runnable);
    }
}
