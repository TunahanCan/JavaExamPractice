package com.ocp.chapter13.writing_thread_safe_code.orchestrating_tasks_with_a_cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class LionPenManagerWithCyclicBarrier {

    private void removeLions() {
        System.out.println("Removing lions. Thread#name" + Thread.currentThread().getName());
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen Thread#name" + Thread.currentThread().getName());
    }

    private void addLions() {
        System.out.println("Adding lions Thread#name" + Thread.currentThread().getName());
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeLions();
            c1.await();
            cleanPen();
            c2.await();
            addLions();
        } catch (BrokenBarrierException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(4);
        try {
            var manager = new LionPenManagerWithCyclicBarrier();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4, () -> System.out.println("pen cleaned"));

            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.performTask(c1, c2));
            }

        } finally {
            service.shutdown();
        }
    }
}
