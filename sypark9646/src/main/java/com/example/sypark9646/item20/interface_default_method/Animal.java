package com.example.sypark9646.item20.interface_default_method;

public interface Animal {

    default void jump() {
        System.out.println("jump");
    }
}
