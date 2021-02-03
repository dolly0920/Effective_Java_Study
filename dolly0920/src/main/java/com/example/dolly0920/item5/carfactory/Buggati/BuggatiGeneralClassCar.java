package com.example.dolly0920.item5.carfactory.Buggati;

import com.example.dolly0920.item5.Car;

public class BuggatiGeneralClassCar implements Car {
    
    @Override
    public void start() {
        System.out.println("BuggatiGeneral Start");
    }

    @Override
    public void accelerate() {
        System.out.println("BuggatiGeneral accelerate");
    }

    @Override
    public void slowdown() {
        System.out.println("BuggatiGeneral slowdown");
    }

    @Override
    public void stop() {
        System.out.println("BuggatiGeneral stop");
    }
}
