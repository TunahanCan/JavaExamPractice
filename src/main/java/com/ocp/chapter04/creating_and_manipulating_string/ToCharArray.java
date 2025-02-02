package com.ocp.chapter04.creating_and_manipulating_string;

import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ToCharArray {
    public static void main(String[] args) {
        String content = "Hello World";
        char[] chars = content.toCharArray();
        ForkJoinPool pool = new ForkJoinPool(2);
        // Başlangıç tarihini al
        Instant start = Instant.now();
        System.out.println("Başlangıç zamanı: " + start);

        try {
            pool.submit(() -> {
                IntStream.range(0, 1000000)
                        .parallel()
                        .forEach(i -> {
                            for (char c : chars) {
                                System.out.println(c);
                            }
                        });
            }).get();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
        ///////////////////////////////////77
        // Bitiş tarihini al
        Instant end = Instant.now();
        System.out.println("Bitiş zamanı: " + end);
        System.out.println("Geçen süre: " + java.time.Duration.between(start, end).toMillis() + " milisaniye");
    }
}
