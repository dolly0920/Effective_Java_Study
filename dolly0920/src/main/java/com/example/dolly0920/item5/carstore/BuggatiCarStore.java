package com.example.dolly0920.item5.carstore;

import com.example.dolly0920.item5.Car;
import com.example.dolly0920.item5.CarStore;
import com.example.dolly0920.item5.carfactory.Buggati.BuggatiGeneralClassCar;
import com.example.dolly0920.item5.carfactory.Buggati.BuggatiPremiumClassCar;

public class BuggatiCarStore extends CarStore {
    @Override
    public Car createCar(String type) { // custom factory
        if (type.equals("premium")) {
            return new BuggatiPremiumClassCar();
        } else if (type.equals("general")) {
            return new BuggatiGeneralClassCar();
        }
        return null;
    }
}
