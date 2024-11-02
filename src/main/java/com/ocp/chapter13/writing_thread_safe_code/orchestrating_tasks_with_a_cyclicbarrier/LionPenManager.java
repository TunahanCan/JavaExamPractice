package com.ocp.chapter13.writing_thread_safe_code.orchestrating_tasks_with_a_cyclicbarrier;

import java.util.concurrent.Executors;

public class LionPenManager {
    private void removeLions() {
        System.out.println("Removing lions. Thread#name" + Thread.currentThread().getName());
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen Thread#name" + Thread.currentThread().getName());
    }

    private void addLions() {
        System.out.println("Adding lions Thread#name" + Thread.currentThread().getName());
    }

    public void performTask() {
        removeLions();
        cleanPen();
        addLions();
    }

    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(4);
        try {
            var manager = new LionPenManager();
            for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask());
        } finally {
            service.shutdown();
        }
    }
}
