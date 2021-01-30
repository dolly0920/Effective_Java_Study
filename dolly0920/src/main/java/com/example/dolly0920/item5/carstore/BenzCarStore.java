package com.example.dolly0920.item5.carstore;

import com.example.dolly0920.item5.Car;
import com.example.dolly0920.item5.CarStore;
import com.example.dolly0920.item5.carfactory.Benz.BenzGeneralClassCar;
import com.example.dolly0920.item5.carfactory.Benz.BenzPremiumClassCar;

public class BenzCarStore extends CarStore {
    @Override
    public Car createCar(String type) { // custom factory
        if (type.equals("premium")) {
            return new BenzPremiumClassCar();
        } else if (type.equals("general")) {
            return new BenzGeneralClassCar();
        }
        return null;
    }
}
