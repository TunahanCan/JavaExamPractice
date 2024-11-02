package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.concurrent.*;

public class CheckResultExample {

    private static int counter = 0;


    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        try {
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 1_000_000; i++) {
                    counter++;
                }
            }) ;
            result.get(10 , TimeUnit.SECONDS) ; // return null
            System.out.println("reached:");
            System.out.printf("result reference" + result);
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }

    }
}
