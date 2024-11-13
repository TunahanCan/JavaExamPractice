package com.experiment_new_features;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class VirtualThreadFileProcessor {
    private final ExecutorService executor;
    public VirtualThreadFileProcessor() {
        this.executor = Executors.newVirtualThreadPerTaskExecutor();
    }

    public void processFile(String fileName) {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String finalLine = line;
                executor.submit(() -> {
                    String reversedContent = new StringBuilder(finalLine).reverse().toString();
                    System.out.println("İşlenen Satır (ters çevrilmiş): " + reversedContent);
                });
            }
        } catch (Exception e) {
            System.err.println("Dosya işlenirken hata oluştu: " + e.getMessage());
        }
    }

    public void shutdown() {
        try {
            executor.shutdown();
            System.out.println("Virtual thread executor kapatıldı.");
        } catch (Exception e) {
            System.err.println("Executor kapatma sırasında hata oluştu: " + e.getMessage());
        }
    }
}
