package com.ocp.chapter13.intruducing_thread.creatingthread;

public class CreatingThreadExample02 {
    public static void main(String[] args) {
        Runnable printInventory = ()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("printing zoo inventory" + i + Thread.currentThread().getName()) ;
            }
        } ;
        Runnable printRecords = ()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("printing record " + i + Thread.currentThread().getName());
            }
        };
        System.out.println("begin");
        new Thread(printInventory).start();
        new Thread(printRecords).start();
        new Thread(printInventory).start();
        System.out.println("end");
    }
}
