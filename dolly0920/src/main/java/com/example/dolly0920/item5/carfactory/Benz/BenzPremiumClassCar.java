package com.example.dolly0920.item5.carfactory.Benz;

import com.example.dolly0920.item5.Car;

public class BenzPremiumClassCar implements Car {
    
    @Override
    public void start() {
        System.out.println("BenzPremium Start");
    }

    @Override
    public void accelerate() {
        System.out.println("BenzPremium accelerate");
    }

    @Override
    public void slowdown() {
        System.out.println("BenzPremium slowdown");
    }

    @Override
    public void stop() {
        System.out.println("BenzPremium stop");
    }
}
