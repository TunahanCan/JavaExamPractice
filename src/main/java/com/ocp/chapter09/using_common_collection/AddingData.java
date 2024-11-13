package com.ocp.chapter09.using_common_collection;

import java.util.*;

public class AddingData {

    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true


        Collection<String> set = new HashSet<>();
        Set<String> setDeneme = new HashSet<>();

        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));


    }
}
