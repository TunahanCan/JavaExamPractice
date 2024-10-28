package com.ocp.chapter13.intruducing_thread.creatingthread;

public class MyThread extends Thread {
    private final String paramter;

    public MyThread(String paramter) {
        this.paramter = paramter;
    }

    @Override
    public void run() {
        System.out.println("important job running in My thread" + paramter);
    }
}
