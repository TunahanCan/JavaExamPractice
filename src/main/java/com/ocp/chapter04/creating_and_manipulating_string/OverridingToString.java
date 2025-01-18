package com.ocp.chapter04.creating_and_manipulating_string;


public class OverridingToString {

    public static void main(String[] args) {

        Person person = new Person("ahmet", "altan", 1);
        Person person2 = new Person("ahmet", "altan", 2);
        System.out.println(person2);
        System.out.println(person);

        Department department = new Department(1, "IK");
        Department department2 = new Department(2, "HR");
        System.out.println(department);
        System.out.println(department2);
    }
}
