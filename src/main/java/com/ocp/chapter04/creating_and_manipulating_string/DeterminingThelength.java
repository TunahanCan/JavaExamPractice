package com.ocp.chapter04.creating_and_manipulating_string;

public class DeterminingThelength {
    public static void main(String[] args) {
        var name = "animals";
        System.out.println(name.length());

        var empty = "";
        System.out.println(empty.length());

        var whitespace = "             ";
        System.out.println(whitespace.length());

        String escape = "\\-\"-\n-\t";
        System.out.println(escape.length());

        for (char c : escape.toCharArray()) {
            System.out.print("[" + c + "]");
        }
    }
}
