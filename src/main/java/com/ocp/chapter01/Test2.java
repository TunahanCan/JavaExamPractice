package com.ocp.chapter01;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 1000000; i++) {
            Integer test = new Integer(651561561);
            Integer test1 = new Integer(651561561);
            Integer test2 = new Integer(651561561);
            Integer test3 = new Integer(651561561);
            Integer test4 = new Integer(651561561);
        }
        Thread.sleep(500000000);
    }
}
