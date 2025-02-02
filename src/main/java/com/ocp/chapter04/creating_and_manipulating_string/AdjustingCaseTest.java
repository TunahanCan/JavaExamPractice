package com.ocp.chapter04.creating_and_manipulating_string;

import java.util.Locale;

public class AdjustingCaseTest {
    public static void main(String[] args) {
        var testString = "animals";
        System.out.println(testString.toLowerCase());
        System.out.println(testString.toUpperCase());

        System.out.println("Abc123".toLowerCase()); // abc123

        System.out.println("ıişüğçö".toUpperCase(Locale.UK));
        System.out.println("ıişüğçö".toUpperCase(new Locale("tr", "TR")));
        System.out.println();
    }
}
