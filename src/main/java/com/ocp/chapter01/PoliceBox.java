package com.ocp.chapter01;


public class PoliceBox {
    String color;
    long age;

    { System.out.print(0+"- testttt"); }

    public void PoliceBox() {   // Bu bir constructor değil, bir metod.
        color = "blue";
        age = 1200;
    }

    public static void main(String[] time) {
        var p = new PoliceBox();
        var q = new PoliceBox();
        p.color = "green";
        p.age = 1400;
        p = q;  // p artık q'yu referans gösteriyor.
        System.out.println("Q1=" + q.color);
        System.out.println("Q2=" + q.age);
        System.out.println("P1=" + p.color);
        System.out.println("P2=" + p.age);
        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
        int[][] java = new int[1][2];
    }
}
