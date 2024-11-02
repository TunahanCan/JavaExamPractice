package com.ocp.chapter13.writing_thread_safe_code.improving_with_synchronized;

import java.util.concurrent.Executors;

public class SheepManagerSyncExampleV2 {
    private int count = 0;

    private final Object lock = new Object();

    private void incrementCount() {
        synchronized (lock) {
            System.out.println((++count) + " " + "-> " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(100);

        try {
            SheepManagerSyncExampleV2 syncExampleV2 = new SheepManagerSyncExampleV2();
            for (int i = 0; i < 40; i++) {
                service.submit(syncExampleV2::incrementCount);
            }
        } finally {
            service.shutdown();
        }
    }
}
