package com.ocp.chapter04.creating_and_manipulating_string;

public class StringConcatenating {

    public static void main(String[] args) {
        System.out.println(1 + 4 ); // 5
        System.out.println("a" + "b" + "c" + "d"); //abcd
        System.out.println("a" + "b" + "c" + 3); // abc3
        System.out.println(1 + 2 + "abc"); // 3abc
        System.out.println("c" + 1 + 2); //c12
        System.out.println("c" + null); //cnull

        //another test
        int three  = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); //64

        //another test

        var s =  "1";
        s += 2;
        s += 4;
        System.out.println(s);
    }
}
