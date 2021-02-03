package com.example.dolly0920.item5.carfactory.Ferrari;

import com.example.dolly0920.item5.Car;

public class FerrariGeneralClassCar implements Car {
    
    @Override
    public void start() {
        System.out.println("FerrariGeneral Start");
    }

    @Override
    public void accelerate() {
        System.out.println("FerrariGeneral accelerate");
    }

    @Override
    public void slowdown() {
        System.out.println("FerrariGeneral slowdown");
    }

    @Override
    public void stop() {
        System.out.println("FerrariGeneral stop");
    }
}
