package com.ocp.chapter13.writing_thread_safe_code.understand_lock_mechanizm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExampleV1 {

    public static void main(String[] args) {
        Object lock = new Object();
        synchronized (lock) {
            //protected code
        }
        Lock lock1 = new ReentrantLock();
        try {
            lock1.lock();
            //protected code
        } finally {
            lock1.unlock();
        }
    }
}
