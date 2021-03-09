package com.example.sypark9646.item19;

public class Parent {

    public Parent() {
        System.out.println("parent 생성자");
        helpOverride();
    }

    public void overrideMe() {
        helpOverride();
    }

    private void helpOverride(){
        System.out.println("parent override");
    }
}
