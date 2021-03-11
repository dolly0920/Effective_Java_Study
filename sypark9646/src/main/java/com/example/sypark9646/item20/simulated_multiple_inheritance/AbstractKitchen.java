package com.example.sypark9646.item20.simulated_multiple_inheritance;

public abstract class AbstractKitchen implements Kitchen {

    @Override
    public void turnLightOn() {
        System.out.println("light on");
    }

    @Override
    public void turnLightOff() {
        System.out.println("light off");
    }
}
