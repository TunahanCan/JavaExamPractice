package com.ocp.chapter04.creating_and_manipulating_string;

public class CheckedFromEquality {
    public static void main(String[] args) {
        System.out.println("abc".equals("abc")); //true
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equalsIgnoreCase("abc")); //true
    }
}
