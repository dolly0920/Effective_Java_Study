package com.example.dolly0920.item5.carfactory.Ferrari;

import com.example.dolly0920.item5.Car;

public class FerrariPremiumClassCar implements Car {

    @Override
    public void start() {
        System.out.println("FerrariPremium Start");
    }

    @Override
    public void accelerate() {
        System.out.println("FerrariPremium accelerate");
    }

    @Override
    public void slowdown() {
        System.out.println("FerrariPremium slowdown");
    }

    @Override
    public void stop() {
        System.out.println("FerrariPremium stop");
    }
}
