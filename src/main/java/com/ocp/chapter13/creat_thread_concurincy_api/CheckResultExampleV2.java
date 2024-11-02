package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.concurrent.*;


/**
 * this is called by clable interface
 */
public class CheckResultExampleV2 {

    private static int counter = 0;

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();

        try {
            Future<Integer> result = service.submit(() -> {
               for (int i = 0; i < 1_000_000; i++) {
                   counter++;
               }
               return counter;
            });
            Integer counterResult = result.get(10 , TimeUnit.SECONDS);
            System.out.println("counterResult: " + counterResult);
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }

    }
}
