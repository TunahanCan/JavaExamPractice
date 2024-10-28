package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SubmittedTaskExample3 {

    public static void main(String[] args) {
        Callable<Integer> task1 = ()-> 100;
        Callable<Integer> task2 = ()-> 200;
        Callable<Integer> task3 = ()-> 300;
        Callable<Integer> task4 = ()-> 400;

        ExecutorService service = Executors.newFixedThreadPool(4);
        try{
            Integer i = service.invokeAny(List.of(task1,task2,task3,task4));
            System.out.println(i);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
    }
}
