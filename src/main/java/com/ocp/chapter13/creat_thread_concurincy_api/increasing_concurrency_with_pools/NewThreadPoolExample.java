package com.ocp.chapter13.creat_thread_concurincy_api.increasing_concurrency_with_pools;

import java.util.concurrent.Executors;

public class NewThreadPoolExample {
    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(3);
        Runnable task1 = () ->
                System.out.println("Task-1 , Thread#name : " + Thread.currentThread().getName());

        Runnable task2 = () ->
                System.out.println("Task-2 , Thread#name : " + Thread.currentThread().getName());

        Runnable task3 = () ->
                System.out.println("Task-3 , Thread#name : " + Thread.currentThread().getName());

        Runnable task4 = () ->
                System.out.println("Task-4 , Thread#name : " + Thread.currentThread().getName());

        Runnable task5 = () ->
                System.out.println("Task-5 , Thread#name : " + Thread.currentThread().getName());

        Runnable task6 = () ->
                System.out.println("Task-6 , Thread#name : " + Thread.currentThread().getName());

        Runnable task7 = () ->
                System.out.println("Task-7 , Thread#name : " + Thread.currentThread().getName());

        service.execute(task1);
        service.execute(task2);
        service.execute(task3);
        service.execute(task4);
        service.execute(task5);
        service.execute(task6);
        service.execute(task7);
        service.shutdown();
    }
}
