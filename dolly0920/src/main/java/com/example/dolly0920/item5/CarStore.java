package com.example.dolly0920.item5;

public abstract class CarStore { // setting format (abstract -> createCar() method)
    public Car orderCar(String type) {
        Car car = createCar(type);
        car.start();
        car.accelerate();
        car.slowdown();
        car.stop();
        return car;
    }
    // abstract factory method => Force definition in subclass
    public abstract Car createCar(String type);
}
