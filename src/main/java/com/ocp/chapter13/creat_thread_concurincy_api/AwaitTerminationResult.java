package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationResult {
    public static void main(String[] args) throws InterruptedException {

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing record: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        var service = Executors.newSingleThreadExecutor();
        try {

            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");

        } finally {
            service.shutdown();
        }
        //boolean awaitTerminationResult = service.awaitTermination(1, TimeUnit.SECONDS);
        boolean awaitTerminationResult = service.awaitTermination(1, TimeUnit.MINUTES);
        // Check whether all tasks are finished

        // ExecutorService.awaitTermination() should only be called after an ExecutorService.shutdown() request.

        if (awaitTerminationResult) //   //if (service.isTerminated())
            System.out.println("Finished!");
        else
            System.out.println("At least one task is still running");

        // Blocks until all tasks have completed execution after a shutdown request,
        // or the timeout occurs, or the current thread is interrupted, whichever happens first.
    }
}
