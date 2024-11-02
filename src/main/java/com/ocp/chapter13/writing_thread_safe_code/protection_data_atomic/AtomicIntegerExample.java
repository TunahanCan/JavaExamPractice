package com.ocp.chapter13.writing_thread_safe_code.protection_data_atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(100);
        System.out.println("get: " + atomicInteger.get());
        System.out.println("getAndIncrement: " + atomicInteger.getAndIncrement());
        System.out.println("decent: " + atomicInteger.decrementAndGet());
        System.out.println("getAndDecrement: " + atomicInteger.getAndDecrement());
    }
}
