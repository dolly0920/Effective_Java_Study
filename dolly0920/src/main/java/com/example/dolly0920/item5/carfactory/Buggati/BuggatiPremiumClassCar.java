package com.example.dolly0920.item5.carfactory.Buggati;

import com.example.dolly0920.item5.Car;

public class BuggatiPremiumClassCar implements Car {
    
    @Override
    public void start() {
        System.out.println("BuggatiPremium Start");
    }

    @Override
    public void accelerate() {
        System.out.println("BuggatiPremium accelerate");
    }

    @Override
    public void slowdown() {
        System.out.println("BuggatiPremium slowdown");
    }

    @Override
    public void stop() {
        System.out.println("BuggatiPremium stop");
    }
}
