package com.ocp.chapter13.writing_thread_safe_code.understand_lock_mechanizm;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * try lock example
 */
public class ReentrantLockExampleV2 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.unlock(); // illegalMonitor// rException
    }
}
