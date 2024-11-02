package com.ocp.chapter13.writing_thread_safe_code.improving_with_synchronized;

import java.util.concurrent.Executors;

public class SheepManagerSyncExample {

    private int sheepCounter = 0;

    private void incrementSheepCounter() {
        synchronized (this) {
            System.out.print((++sheepCounter) + " ");
        }
    }


    public static void main(String[] args) {
        var service  = Executors.newFixedThreadPool(30);
        try {
            SheepManagerSyncExample sheepManager = new SheepManagerSyncExample();
            for (int i = 0; i < 10; i++) {
                service.submit(sheepManager::incrementSheepCounter);
            }
        } finally {
            service.shutdown();
        }
    }

}
