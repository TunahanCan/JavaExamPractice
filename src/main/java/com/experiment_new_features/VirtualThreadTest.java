package com.experiment_new_features;


import java.time.Duration;
import java.time.Instant;

public class VirtualThreadTest {

    public static void main(String[] args) {
        VirtualThreadFileProcessor processor = new VirtualThreadFileProcessor();

        // Başlangıç zamanını al
        Instant start = Instant.now();
        System.out.println("İşlem başlangıç zamanı: " + start);

        // "test.txt" dosyasını işle
        System.out.println("Dosya işleniyor...");
        processor.processFile("test.txt");

        // İşlem tamamlandıktan sonra kapatma
        processor.shutdown();

        Instant end = Instant.now();
        System.out.println("İşlem bitiş zamanı: " + end);

        // Toplam süreyi hesapla
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Toplam geçen süre (milisaniye): " + timeElapsed.toMillis() + " ms");
    }

}
