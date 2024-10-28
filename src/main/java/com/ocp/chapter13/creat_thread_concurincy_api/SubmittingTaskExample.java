package com.ocp.chapter13.creat_thread_concurincy_api;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SubmittingTaskExample {

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("MyRunnable #run invoked");
        }
    }

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("hello-message-Task");
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        try{
            service.execute(task);
            service.submit(task);
            service.submit(new MyRunnable());
        } finally {
            service.shutdown();
        }
    }
}
