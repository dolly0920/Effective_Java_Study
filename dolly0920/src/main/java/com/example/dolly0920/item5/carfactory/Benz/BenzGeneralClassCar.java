package com.example.dolly0920.item5.carfactory.Benz;

import com.example.dolly0920.item5.Car;

public class BenzGeneralClassCar implements Car {

    @Override
    public void start() {
        System.out.println("BenzGeneral Start");
    }

    @Override
    public void accelerate() {
        System.out.println("BenzGeneral accelerate");
    }

    @Override
    public void slowdown() {
        System.out.println("BenzGeneral slowdown");
    }

    @Override
    public void stop() {
        System.out.println("BenzGeneral stop");
    }
}
