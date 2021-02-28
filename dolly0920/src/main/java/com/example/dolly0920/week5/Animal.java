package com.example.dolly0920.week5;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Animal {
    private final String name;
    private final int Old;

    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}
