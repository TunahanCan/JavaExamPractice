package com.ocp.chapter13.using_concurrent_collections.obtaining_syncronized_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedListExampleV2 {

    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        List<Integer> originals = new ArrayList<>();
        originals.add(1);
        originals.add(2);
        originals.add(3);
        originals.add(4);

        List<Integer> synchronizedList = Collections.synchronizedList(originals);
        List<Integer> nonSynchronizedList = new ArrayList<>(originals);
        List<Integer> nonSynchronizedListWithObjectLock = new ArrayList<>(originals);
        List<Integer> nonSynchronizedListWithReentrantLock = new ArrayList<>(originals);

        var service = Executors.newCachedThreadPool();
        ReentrantLock reentrantLock = new ReentrantLock();

        for (int i = 0; i < 10000; i++) {
            service.submit(() -> synchronizedList.add(new Random().nextInt()));
            service.submit(() -> nonSynchronizedList.add(new Random().nextInt()));

            service.submit(() -> {
                synchronized (lock) {
                    nonSynchronizedListWithObjectLock.add(new Random().nextInt());
                }
            });

            service.submit(() -> {
                try {
                    reentrantLock.lock();
                    nonSynchronizedListWithReentrantLock.add(new Random().nextInt());
                } finally {
                    reentrantLock.unlock();
                }
            });
        }

        service.shutdown();
        boolean result = service.awaitTermination(1, TimeUnit.MINUTES);
        if(result){
            System.out.println(synchronizedList.size());
            System.out.println(nonSynchronizedList.size());
            System.out.println(nonSynchronizedListWithObjectLock.size());
            System.out.println(nonSynchronizedListWithReentrantLock.size());
        }
    }
}
