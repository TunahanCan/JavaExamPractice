package com.ocp.chapter13.intruducing_thread.creatingthread;

public class CreatingThreadExample {
    public static void main(String[] args) {
        new Thread(()-> System.out.print("hello" + Thread.currentThread().getName() + "#" )).start();
        System.out.print("world" + Thread.currentThread().getName() + "#");
    }
}
