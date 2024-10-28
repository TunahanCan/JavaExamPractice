package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;


public class SubmittingTaskExample2 {
    public static void main(String[] args) {
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 0; i < 10000; i++) {
                sum = sum + i;
            }
            return sum;
        };

        Callable<Integer> task2 = ()-> new Random().nextInt();
        ExecutorService service = Executors.newSingleThreadExecutor();
        try{
            List<Future<Integer>> futures = service.invokeAll(List.of(task,task2));
            for (Future<Integer> future : futures) {
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
    }
}
