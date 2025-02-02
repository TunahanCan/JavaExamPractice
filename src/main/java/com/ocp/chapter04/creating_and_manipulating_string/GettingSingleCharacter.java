package com.ocp.chapter04.creating_and_manipulating_string;

public class GettingSingleCharacter {
    public static void main(String[] args) {
        String testString = "Hello World";
        System.out.println(testString.charAt(0));
        System.out.println(testString.charAt(1));
        System.out.println(testString.charAt(244));
    }
}
