package com.ocp.chapter04.creating_and_manipulating_string;

public class GetChars {
    public static void main(String[] args) {
        String content = "Hello World";
        char[] charContent = new char[4];
        content.getChars(0, 4, charContent, 0);
        System.out.println(charContent);
    }
}
