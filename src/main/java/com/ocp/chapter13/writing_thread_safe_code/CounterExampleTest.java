package com.ocp.chapter13.writing_thread_safe_code;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CounterExampleTest {
    public static void main(String[] args) throws InterruptedException {

        var executorService = Executors.newFixedThreadPool(20);

        CounterExampleModel counter = new CounterExampleModel();

        for (int i = 0; i < 1_000; i++) {
            executorService.submit(counter::execute);
        }

        executorService.shutdown();
        boolean finished = executorService.awaitTermination(5, TimeUnit.SECONDS);

        if (finished)
            System.out.println(counter.getCount());

        // https://docs.oracle.com/javase/tutorial/essential/concurrency/interfere.html

    }
}
