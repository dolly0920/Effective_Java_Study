package com.example.dolly0920.item8;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

    public static void main(String[] args) {
        // simulation 1 : <hashmap>> when key reference will be null, verify using memory.
        // simulation 2 : <weakhashmap> when key reference will be null, verify using memory.
        WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;

        weakHashMap.put(key1, "test1");
        weakHashMap.put(key2, "test2");

        //hashMap.put(key1, "test3");
        //hashMap.put(key2, "test4");

        key1 = null;
        //key2 = null;

        System.gc();  //강제 Garbage Collection

        weakHashMap.entrySet().stream().forEach(el -> System.out.println(el));
        //hashMap.entrySet().stream().forEach(el -> System.out.println(el));
    }
}
