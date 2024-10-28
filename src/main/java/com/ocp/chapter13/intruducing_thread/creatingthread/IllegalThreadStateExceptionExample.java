package com.ocp.chapter13.intruducing_thread.creatingthread;

public class IllegalThreadStateExceptionExample {

    public static void main(String[] args) {
        Thread thread = new Thread() ;
        thread.start();
        thread.start();
    }
}
