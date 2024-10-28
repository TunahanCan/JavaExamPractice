package com.ocp.chapter13.intruducing_thread.creatingthread;

public class ForLoopRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runnable running " + Thread.currentThread().getName() + " i :" + i) ;
        }
    }
}
