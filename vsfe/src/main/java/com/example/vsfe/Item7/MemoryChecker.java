package com.example.vsfe.Item7;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class MemoryChecker {
    private final List<WeakReference<BigSizeClass>> weaks = new LinkedList<>();
    private final List<SoftReference<BigSizeClass>> softs = new LinkedList<>();
    private final List<BigSizeClass> strongs = new LinkedList<>();

    public void weakReferenceTest() {
        try {
            for(int i = 0; i < 10000; i++) {
                weaks.add(new WeakReference<>(new BigSizeClass()));
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of Memory");
        }
    }

    public void softReferenceTest() {
        try {
            for(int i = 0; i < 10000; i++) {
                softs.add(new SoftReference<>(new BigSizeClass()));
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of Memory");
        }
    }

    public void strongReferenceTest() {
        try {
            for(int i = 0; i < 10000; i++) {
                strongs.add(new BigSizeClass());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of Memory");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MemoryChecker mc = new MemoryChecker();

        mc.weakReferenceTest();
        Thread.sleep(5000);
        mc.strongReferenceTest();
        Thread.sleep(5000);
        // 319.7MB -> 1137.7MB
        System.out.println();
    }
}
