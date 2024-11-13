package com.experiment_new_features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolFileProcessor {

    private final ExecutorService executor;

    public ThreadPoolFileProcessor(int threadCount) {
        this.executor = Executors.newFixedThreadPool(threadCount);
    }

    public void processFile(String fileName) {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String finalLine = line;
                executor.submit(() -> {
                    String reversedContent = new StringBuilder(finalLine).reverse().toString();
                    System.out.println("İçerik (ters çevrilmiş): " + reversedContent);
                });
            }

        } catch (IOException e) {
            System.err.println("Dosya okunurken hata oluştu: " + e.getMessage());
        }
    }

    public void shutdown() {
        try {
            executor.shutdown();
            if (!executor.awaitTermination(5, TimeUnit.MINUTES)) {
                System.out.println("Tüm görevler tamamlanamadı.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Kapatma işlemi kesildi.");
        }
    }
}
