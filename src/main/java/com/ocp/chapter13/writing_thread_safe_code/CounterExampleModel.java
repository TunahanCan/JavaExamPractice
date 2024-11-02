package com.ocp.chapter13.writing_thread_safe_code;

public class CounterExampleModel {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    public void execute(){
        increment();
        decrement();
    }
}
