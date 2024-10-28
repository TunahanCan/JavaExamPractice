package com.ocp.chapter13.intruducing_thread.distingushing_thread_type;

public class TestDaemonThread1  extends Thread{

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon is work");
        } else {
            System.out.println("user thread is work");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread1 t1 = new TestDaemonThread1();
        TestDaemonThread1 t2 = new TestDaemonThread1();
        t2.setName("TestDaemonThread2");
        TestDaemonThread1 t3 = new TestDaemonThread1();
        t3.setName("TestDaemonThread3");

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
