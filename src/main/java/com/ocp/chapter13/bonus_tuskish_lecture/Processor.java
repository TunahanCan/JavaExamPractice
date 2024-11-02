package com.ocp.chapter13.bonus_tuskish_lecture;


/**
 * Aynı veri ile ilgilenen birden fazla threadin veriye erişiminin düzenlenmesine threadlerin
 * senkronizasyonu denir. Threadlerin senkronizasyonu sırasında karşılaştığımız zorlukların ilki
 * bazı durumlarda verinin performans gerekçesiyle otomatik olarak önbelleklenmesidir
 */

public class Processor extends Thread{
    private volatile boolean running = true;


    @Override
    public void run() {
        while (running) {
            System.out.println("Hello World");
        }
    }


    /**
     * “run()” metodunun içeriğini incelersek bu sınıftan bir örnek oluşturup “start()” metodunu
     * çağırdığımızda başlatılacak olan threadin sonsuza kadar “Merhaba” yazdıracağını görebiliriz.
     * Çünkü “running” değişkeni her zaman “true” değerindedir. Gelin yeni bir metot ekleyelim ve
     * çağrıldığında  “running” değişkeninin değerini “false” yaparak “while” döngüsünü sonlandırmış
     * olalım, dolayısıyla thread de sonlanmış olsun:
     */

    public void stopRunning() {
        running = false;
    }
}
