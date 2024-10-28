package com.ocp.chapter13.intruducing_thread.distingushing_thread_type;

public class Zoo {
    public static void pause() {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread finished" );
    }

    public static void main(String[] args) {
        var job = new Thread( ()-> pause() );
        job.setDaemon(true);
        job.start();
        System.out.println("main thread finished");
    }
}
