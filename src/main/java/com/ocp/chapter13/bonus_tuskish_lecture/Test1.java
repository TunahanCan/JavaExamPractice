package com.ocp.chapter13.bonus_tuskish_lecture;


public class Test1 {


    public static void main(String[] args) throws InterruptedException {
        Processor processor = new Processor();
        processor.start();
        Thread.sleep(1000);
        processor.stopRunning();
    }

}
