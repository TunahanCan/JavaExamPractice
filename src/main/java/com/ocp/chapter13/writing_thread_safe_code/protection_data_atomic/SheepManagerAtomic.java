package com.ocp.chapter13.writing_thread_safe_code.protection_data_atomic;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManagerAtomic {

    private final AtomicInteger sheepCounter = new AtomicInteger(0);

    private void incrementAndReport(){
        System.out.print(sheepCounter.incrementAndGet() + "");
    }

    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(30);
        try {
            SheepManagerAtomic atomic = new SheepManagerAtomic();
            for (int i = 0; i < 10; i++) {
                service.submit(atomic::incrementAndReport);
            }
        } finally {
            service.shutdown();
        }
    }

}
