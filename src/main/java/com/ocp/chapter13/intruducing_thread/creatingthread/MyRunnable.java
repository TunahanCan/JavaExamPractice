package com.ocp.chapter13.intruducing_thread.creatingthread;

public class MyRunnable implements Runnable{

    private final String parameter;

    public MyRunnable(String parameter){
        this.parameter = parameter;
    }

    @Override
    public void run() {
        System.out.println("important job running in runnable {}" + parameter);
    }
}
