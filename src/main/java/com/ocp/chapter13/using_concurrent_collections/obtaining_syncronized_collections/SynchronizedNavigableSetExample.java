package com.ocp.chapter13.using_concurrent_collections.obtaining_syncronized_collections;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SynchronizedNavigableSetExample {

    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(1205);
        navigableSet.add(1206);
        navigableSet.add(1207);
        navigableSet.add(1208);
        navigableSet.add(1205);
        navigableSet.add(1505);
        navigableSet.add(1545);
        navigableSet.add(1830);
        navigableSet.add(2010);
        navigableSet.add(2100);

        System.out.println("last before 4pm is: " + navigableSet.lower(1600));
        System.out.println("first after 8pm is: " + navigableSet.higher(2000));

        NavigableSet<Integer> navigableSetCollection = Collections.synchronizedNavigableSet(navigableSet);
        System.out.println(navigableSetCollection.ceiling(2010));
        System.out.println(navigableSetCollection.higher(2010));

    }
}
