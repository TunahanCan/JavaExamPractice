package com.ocp.chapter13.writing_thread_safe_code;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CollectorExampleTest {
    public static void main(String[] args) throws InterruptedException {
        var service = Executors.newCachedThreadPool();
        CollectorExampleModel collectorExampleModel = new CollectorExampleModel();
        for (int i = 0; i < 1_000; i++) {
            service.submit(() -> {
                collectorExampleModel.add(1);
                System.out.println("Thread: " + Thread.currentThread().getName());
            });
        }
        service.shutdown();
        boolean awaitTermination = service.awaitTermination(5, TimeUnit.SECONDS);
        if (awaitTermination) {
            System.out.println("counter : " + collectorExampleModel.getSum());
        }
    }
}
