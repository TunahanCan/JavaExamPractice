package com.ocp.chapter13.writing_thread_safe_code.understand_lock_mechanizm;


import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExampleV3 {

    private static void printHello(Lock lock){
        try {
            lock.lock();
            System.out.println("Hello World #threadname " + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        var service = Executors.newFixedThreadPool(10);
        Lock lock = new ReentrantLock();

        for (int i = 0; i < 100; i++) {
            service.submit((()-> printHello(lock)));
        }

        service.shutdown();
        boolean result = service.awaitTermination(5, TimeUnit.SECONDS);

        if (result){
            System.out.println("all threads finished");
        }
    }
}
