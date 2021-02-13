package com.example.dolly0920.item7;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        // simulation 2 : <weakhashmap> when key reference will be null, verify using memory.
        HashMap<Integer, String> hashMap = new HashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;

        hashMap.put(key1, "test1");
        hashMap.put(key2, "test2");

        key1 = null;

        System.gc();

        hashMap.entrySet().stream().forEach(el -> System.out.println(el));
    }
}
