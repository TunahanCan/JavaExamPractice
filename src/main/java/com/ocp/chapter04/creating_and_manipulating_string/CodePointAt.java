package com.ocp.chapter04.creating_and_manipulating_string;

public class CodePointAt {

    public static void main(String[] args) {
        int unicode = "abc".codePointAt(0);
        System.out.print(String.format("\\u%04x", unicode));
    }
}
