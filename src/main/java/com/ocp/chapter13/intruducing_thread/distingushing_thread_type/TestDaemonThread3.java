package com.ocp.chapter13.intruducing_thread.distingushing_thread_type;

public class TestDaemonThread3 extends Thread {
    @Override
    public void run(){
        System.out.println("name: " + Thread.currentThread().getName());
        System.out.println("daemon:" + Thread.currentThread().isDaemon());
    }
    public static void main(String[] args) {
        TestDaemonThread3 t = new TestDaemonThread3();
        t.start();
        t.setDaemon(true);
    }
}
