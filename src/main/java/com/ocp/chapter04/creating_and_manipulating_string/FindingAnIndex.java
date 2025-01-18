package com.ocp.chapter04.creating_and_manipulating_string;

public class FindingAnIndex {
    public static void main(String[] args) {
        var test = "animals";
        System.out.println(test.indexOf("a"));
        System.out.println(test.indexOf("al"));
        System.out.println(test.indexOf("lx"));
        System.out.println(test.indexOf("a" , 4));


        //last index of testen bakar sondan itibaren

        var testReverse = "abc ddd ee ff gg tunahan";
        System.out.println(testReverse.lastIndexOf("tunahan"));
        System.out.println(testReverse.lastIndexOf("a"));


    }
}
