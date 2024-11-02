package com.ocp.chapter13.writing_thread_safe_code.improving_with_synchronized;

import java.util.concurrent.Executors;

public class SheepManagerBadSynchronized {

    private int sheepCount = 0;


    private void incrementSheepCount() {
        System.out.print((++sheepCount) + " ");
    }

    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(20);

        try {
            SheepManagerBadSynchronized sheepManager = new SheepManagerBadSynchronized();
            for (int i = 0; i < 10; i++) {
                synchronized (sheepManager) {
                    service.submit(sheepManager::incrementSheepCount);
                }
            }
        } finally {
            service.shutdown();
        }
    }
}
