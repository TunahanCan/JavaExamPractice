package com.ocp.chapter13.writing_thread_safe_code.understand_lock_mechanizm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTryLockExample {

    private static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello World");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Thread(() -> printHello(lock)).start();


        Thread.sleep(100);
        if (lock.tryLock()) {
            try {
                System.out.println("lock is obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }
}
