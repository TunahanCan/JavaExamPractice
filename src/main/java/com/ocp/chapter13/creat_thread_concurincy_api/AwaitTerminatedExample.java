package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AwaitTerminatedExample {


    public static void main(String[] args) {

        var service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(() -> 30 + 11) ;
            System.out.println(result.get());
            System.out.println(result.isDone());
            System.out.println(result.isCancelled());
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
    }

}
