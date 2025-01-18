package com.ocp.chapter04.creating_and_manipulating_string;

public class SearchingForSubstring {
    public static void main(String[] args) {

        System.out.println("abc".startsWith("a")); //true
        System.out.println("abc".startsWith("A")); //false

        System.out.println("abc".endsWith("c")); //true
        System.out.println("abc".endsWith("a")); //false

        System.out.println("abc".contains("b")); //true
        System.out.println("abc".contains("B")); //false

        System.out.println("injavawetrust".startsWith("in"));
        System.out.println("injavawetrust".contains("java"));
        System.out.println("injavawetrust".endsWith("trust"));
    }
}
