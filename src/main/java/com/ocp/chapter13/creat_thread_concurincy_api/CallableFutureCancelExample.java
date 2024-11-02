package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureCancelExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        var service = Executors.newSingleThreadExecutor();
        Callable<String> callableMessage = () -> {
            Thread.sleep(1000);
            return "Callable Message";
        };
        int counter = 0;
        Future<String> stringFuture = service.submit(callableMessage);
        while (!stringFuture.isDone()) {
            System.out.println("Task is still running");
            Thread.sleep(200);
            counter++;
            if (counter > 3) {
                System.out.println("Cancelling");
                stringFuture.cancel(true);

            }
        }
        if (!stringFuture.isCancelled()) {
            System.out.println("Task complated retreving result");
            String result = stringFuture.get();
            System.out.println(result);
        } else {
            System.out.println(" task was cancelled");
        }
        service.shutdown();
    }
}
