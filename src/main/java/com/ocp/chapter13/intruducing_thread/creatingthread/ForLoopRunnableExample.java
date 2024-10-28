package com.ocp.chapter13.intruducing_thread.creatingthread;

public class ForLoopRunnableExample {
    public static void main(String[] args) {
        ForLoopRunnable runnable = new ForLoopRunnable();
        Thread t1 = new Thread(runnable, "first-thread");
        Thread t2 = new Thread(runnable, "second-thread");
        Thread t3 = new Thread(runnable, "third-thread");
        Thread t4 = new Thread(runnable, "fourth-thread");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
