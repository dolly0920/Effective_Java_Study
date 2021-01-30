package com.example.dolly0920.item5.carstore;

import com.example.dolly0920.item5.Car;
import com.example.dolly0920.item5.CarStore;
import com.example.dolly0920.item5.carfactory.Ferrari.FerrariGeneralClassCar;
import com.example.dolly0920.item5.carfactory.Ferrari.FerrariPremiumClassCar;

public class FerrariCarStore extends CarStore {
    @Override
    public Car createCar(String type) { // custom factory
        if (type.equals("premium")) {
            return new FerrariPremiumClassCar();
        } else if (type.equals("general")) {
            return new FerrariGeneralClassCar();
        }
        return null;
    }
}
