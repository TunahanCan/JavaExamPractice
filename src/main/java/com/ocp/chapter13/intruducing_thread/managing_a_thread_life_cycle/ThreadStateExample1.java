package com.ocp.chapter13.intruducing_thread.managing_a_thread_life_cycle;

public class ThreadStateExample1 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Current thread: " + currentThread);
        System.out.println("Current thread state: " + currentThread.getState());
        System.out.println(currentThread.isAlive());

        Thread thread = new Thread(()-> {
            System.out.println("hello world");
        });
        System.out.println("before thread.start");
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());
        thread.start();

        System.out.println("## after thread.start ##");
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());
    }
}
