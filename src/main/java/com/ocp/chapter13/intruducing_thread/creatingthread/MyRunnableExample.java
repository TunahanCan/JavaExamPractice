package com.ocp.chapter13.intruducing_thread.creatingthread;


public class MyRunnableExample {

    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("parameter-1");
        MyRunnable myRunnable2 = new MyRunnable("parameter-2");
        MyRunnable myRunnable3 = new MyRunnable("parameter-3");
        MyRunnable myRunnable4 = new MyRunnable("parameter-4");

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);
        Thread thread3 = new Thread(myRunnable3);
        Thread thread4 = new Thread(myRunnable4);

        System.out.println("begin");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        System.out.println("end");

    }
}
