package com.ocp.chapter13.working_paralel_stream.creating_parallel_stream;


import java.util.stream.IntStream;

public class ParallelStreamExample2 {

    public static void main(String[] args) {

        System.out.println("Normal...");
        IntStream range = IntStream.rangeClosed(1, 30);
        range.forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });


        System.out.println("parallel......");

        IntStream range2 = IntStream.rangeClosed(1, 30);
        range2.parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });
    }
}
