package com.example.dolly0920.item7;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

    public static void main(String[] args) {
        // simulation 1 : <hashmap>> when key reference will be null, verify using memory.
        WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;

        weakHashMap.put(key1, "test1");
        weakHashMap.put(key2, "test2");

        key1 = null;

        System.gc();  //Forced Garbage Collection

        weakHashMap.entrySet().stream().forEach(el -> System.out.println(el));
    }
}
