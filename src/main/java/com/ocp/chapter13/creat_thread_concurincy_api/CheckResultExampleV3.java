package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.concurrent.*;

public class CheckResultExampleV3 {

    private static int counter = 0;
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> future = service.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                    for (int i = 0; i < 1_000_000; i++) {
                        counter++;
                    }
                    Thread.sleep(2000); // sleep 2 second
                    return counter;
                }
            });

            Integer counterResult = future.get(1, TimeUnit.SECONDS);
            System.out.println("counterResult: " + counterResult);
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }

    }
}
