package com.ocp.chapter13.bonus_tuskish_lecture;

public class Application {

    private  int count = 0;


    public static void main(String[] args) {
        Application app = new Application();
        app.doCount();
    }

    public synchronized void increment(){
        count++;
    }

    private void doCount(){

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                increment() ;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                increment();
            }
        });
        thread1.start();
        thread2.start();
        System.out.println("sayac:"  +  count);
    }


}
