package com.example.vsfe.Item7;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class MemoryExploder {
    private final List<WeakReference<BigSizeClass>> weaks = new LinkedList<>();
    private final List<SoftReference<BigSizeClass>> softs = new LinkedList<>();
    private final List<BigSizeClass> strongs = new LinkedList<>();

    public void weakReferenceTest() {
        try {
            while(true) {
                weaks.add(new WeakReference<>(new BigSizeClass()));
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of Memory");
        }
    }

    public void softReferenceTest() {
        try {
            while(true) {
                softs.add(new SoftReference<>(new BigSizeClass()));
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of Memory");
        }
    }

    public void strongReferenceTest() {
        try {
            while(true) {
                strongs.add(new BigSizeClass());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of Memory");
        }
    }

    public static void main(String[] args) {
        System.out.println("Tests Start");

        MemoryExploder test = new MemoryExploder();

        //test.weakReferenceTest();
        //test.softReferenceTest();
        test.strongReferenceTest();

        System.out.println("Tests End");
    }
}
