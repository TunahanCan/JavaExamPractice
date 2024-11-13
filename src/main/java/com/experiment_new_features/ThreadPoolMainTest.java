package com.experiment_new_features;

import java.time.Duration;
import java.time.Instant;

public class ThreadPoolMainTest {

    public static void main(String[] args) {
        int threadCount = 10;
        ThreadPoolFileProcessor processor = new ThreadPoolFileProcessor(threadCount);

        Instant start = Instant.now();
        System.out.println("İşlem başlangıç zamanı: " + start);

        // "test.txt" dosyasını işle
        System.out.println("Dosya işleniyor...");
        processor.processFile("test.txt");

        // İşlem tamamlandıktan sonra kapatma
        processor.shutdown();

        // Bitiş zamanını al ve işlem süresini hesapla
        Instant end = Instant.now();
        System.out.println("İşlem bitiş zamanı: " + end);

        // Toplam süreyi hesapla
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Toplam geçen süre (milisaniye): " + timeElapsed.toMillis() + " ms");
    }
}
