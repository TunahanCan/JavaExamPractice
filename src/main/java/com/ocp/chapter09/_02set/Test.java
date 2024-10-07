package com.ocp.chapter09._02set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *  Set arayüzü collectiondan türemiştir ve elemanları tekrarlanmayan uniq bir şekilde  saklamıştır
 *  en önemli özelliği uniq olması
 *  set arayüzü düzenli bir sılrama garantisi vermez
 */

public class Test {
    public static void main(String[] args) {

        /**
         *  hash set elemanlari hashing kullanarak saklar bu nedenle ekleme silme ve arama çok hızlı
         *
         *  avantajları o1 zamanda ekleme silme arama
         *  elemena tekarı engeller
         *
         *  dezavantaj elemanlar ssıralı değil ekleme sırasına göre saklanmaz
         */
        Set<String> hashsetTest = new HashSet<>();
        hashsetTest.add("test");
        hashsetTest.add("test2");
        hashsetTest.add("test2");
        hashsetTest.forEach(System.out::println);


        /**
         * LinkedHashASet
         *   hashsete çok benzer farkı elemanları ekleme zamanında göre sıralı saklar  bu nedenle sıralı veri tutma gerekliyse kullanılır
         *
         *   avantajları
         *   elemanlar ekleme sırasına göre saklanır
         *    hızlı ekleme silme bulma
         *
         *  dezavantajları
         *  hashsetten fazla hafıza tüketir çünkü doubly linked list kullnaır
         */

        Set<String> linkedHashSetTest = new LinkedHashSet<>();
        linkedHashSetTest.add("test");
        linkedHashSetTest.add("test2");
        linkedHashSetTest.add("test2");
        linkedHashSetTest.forEach(System.out::println);


        /**
         *  Treeset elemanları doğal sıralama alfabetik yada sayısak yada belirledğimiz bir karşılaştruıcay göre
         *   comprator göre sıralı tutar bu sıralı yapı red-black tree veri yapısı ile sağlanır
         *
         *   avantajları
         *    elemanlar doğal sıralamaya yada belirlenen sıralmaya göre sıralnaır
         *    ağaç yapısının sağladıı avantahjları jhızlı sırlama yapılır
         *
         *   dezavantjları
         *   hashset ve linkedhashsete göre yavaş
         */

        Set<String> treeSetTest = new TreeSet<>();
        treeSetTest.add("test");
        treeSetTest.add("test2");
        treeSetTest.add("test2");
        treeSetTest.forEach(System.out::println);

        /**
         * Set Arayüzünün Özellikleri ve Farklılıkları
         * HashSet: Benzersiz elemanları hızlı şekilde ekleyip çıkartmak istediğinizde en uygun seçenektir. Ancak elemanlar sıralı değildir.
         * LinkedHashSet: Ekleme sırasını korur ve sıralı veri tutmak istediğinizde kullanılır.
         * TreeSet: Elemanları doğal sıralama ya da bir karşılaştırıcı (comparator) ile sıralamak için kullanılır.
         */
    }
}
