package com.ocp.chapter13.writing_thread_safe_code;

public class CollectorExampleModel {
    private long sum = 0;

    public void add(long value) {
        this.sum = this.sum + value;
    }

    public long getSum() {
        return this.sum;
    }
}
