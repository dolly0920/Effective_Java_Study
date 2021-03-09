package com.example.sypark9646.item19;

public class Parent {

    public Parent() {
        System.out.println("parent 생성자");
        overrideMe();
    }

    public void overrideMe() {
        System.out.println("parent override");
    }
}
