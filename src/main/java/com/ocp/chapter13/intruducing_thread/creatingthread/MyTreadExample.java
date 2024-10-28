package com.ocp.chapter13.intruducing_thread.creatingthread;

public class MyTreadExample {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("parameter-1");
        MyThread myThread2 = new MyThread("parameter-2");
        MyThread myThread3 = new MyThread("parameter-3");
        MyThread myThread4 = new MyThread("parameter-4");
        MyThread myThread5 = new MyThread("parameter-5");

        System.out.println("begin");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        System.out.println("end");
    }
}
