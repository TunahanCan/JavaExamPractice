package com.ocp.chapter13.using_concurrent_collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class AvoidConcurrentModificationExceptionExample {

    public static void testDataWithConcurrentModificationException() {
        var foodData = new HashMap<String,Integer>();
        foodData.put("Apple", 1);
        foodData.put("Banana", 2);
        foodData.put("Orange", 3);
        for (String food : foodData.keySet()) {
            foodData.remove(food);
        }
    }

    public static void testDataWithoutConcurrentModificationException() {
        var foodData = new ConcurrentHashMap<String,Integer>();
        foodData.put("Apple", 1);
        foodData.put("Banana", 2);
        foodData.put("Orange", 3);
        for (String food : foodData.keySet()) {
            foodData.remove(food);
        }
    }


    public static void main(String[] args) {
       // testDataWithConcurrentModificationException();
        testDataWithoutConcurrentModificationException();
    }
}
