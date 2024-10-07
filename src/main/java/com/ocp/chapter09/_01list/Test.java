package com.ocp.chapter09._01list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * List arayüzü, Java'da farklı veri tiplerinin düzenli ve dinamik olarak saklanmasını sağlar ve elemanlar index (indis) yardımıyla erişilebilir.
 * Java'daki List arayüzü şu özellikleri barındırır:
 * <p>
 * Sıralı veri saklama: Elemanlar eklenme sırasına göre sıralı olarak tutulur.
 * Dubleksiyon (Çiftleme) desteklenir: Aynı elemandan birden fazla saklanabilir.
 * Index erişimi: Elemanlara, indeksleri ile erişilebilir.
 */


public class Test {

    public static void main(String[] args) {
        /**
         * ArrayList
         * Avantajlar:
         *
         *  Hızlı rastgele erişim.
         *  Dinamik boyut: Veri ekleme ve silme işlemleri ile kapasitesi artar veya azalır.
         *
         *
         *  Dezavantajlar:
         *
         * Ver i silme ve ekleme işlemleri, özellikle ortadan yapılıyorsa,
         * yavaş olabilir (çünkü veri kaydırma işlemleri yapılır).
         */
        List<String> arrayTest = new ArrayList<>();
        arrayTest.add("A");
        arrayTest.add("B");
        arrayTest.forEach(System.out::println);


        /**
         * LinkedList
         *
         * LinkedList, hem List hem de Deque arayüzlerini uygular. Elemanlar bağlantılı bir liste şeklinde tutulur.
         * Her eleman, bir önceki ve bir sonraki elemana referans tutar.
         *
         * Avantajlar:
         *
         * Veri ekleme ve silme işlemleri daha hızlıdır, çünkü dizi kaydırmaya gerek yoktur.
         * Çift yönlü gezilebilme özelliği vardır.
         *
         * Dezavantajlar:
         *
         * Rastgele erişim, ArrayList’e göre daha yavaştır, çünkü veri zincirleme şekilde aranır.
         *
         */

        List<String> arrayTest2 = new LinkedList<>();
        arrayTest2.add("A");
        arrayTest2.add("B");
        arrayTest2.forEach(System.out::println);


        /**
         * ) Vector
         * Vector, ArrayList’e benzer, fakat senkronize edilmiş bir yapıdır. Bu, Vector’ın thread-safe (çoklu iş parçacığı güvenliği) olduğu anlamına gelir.
         *
         * Avantajlar:
         * Çoklu iş parçacığı (thread) ortamlarında kullanılabilir.
         * Dezavantajlar:
         * Senkronizasyon işlemi performansı düşürebilir.
         */
        List<String> vector = new Vector<>();
        vector.add("Java");
        vector.get(0); // Thread-safe


    }
}
