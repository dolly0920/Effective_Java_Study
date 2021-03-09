package com.example.sypark9646.item19;

import java.time.Instant;

public class Child extends Parent {

    private final Instant instant;

    public Child() {
        System.out.println("child 생성자");
        this.instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println("child override");
        System.out.println(instant);
    }
}
