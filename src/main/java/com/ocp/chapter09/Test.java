package com.ocp.chapter09;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        // 12. Satır: List<?> q = List.of("mouse", "parrot");
        List<?> q = List.of("mouse", "parrot");

        // 13. Satır: var v = List.of("mouse", "parrot");
        var v = List.of("mouse", "parrot");

        v.removeIf(s -> s.length() == 4);
        // 15. Satır: q.removeIf(String::isEmpty); // Derleme hatası verir

        // 16. Satır: q.removeIf(s -> s.length() == 4); // Derleme hatası verir
        // q.removeIf(s -> s.length() == 4);

        // 17. Satır: v.removeIf(String::isEmpty); // Derleme hatası verir
        // v.removeIf(String::isEmpty);

        v.removeIf(s -> s.length() == 4); // Derleme hatası verir


        System.out.println("q: " + q);
        System.out.println("v: " + v);

    }
}
