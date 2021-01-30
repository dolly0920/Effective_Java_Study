package com.example.dolly0920.item5;

import com.example.dolly0920.item5.carstore.BenzCarStore;
import com.example.dolly0920.item5.carstore.BuggatiCarStore;
import com.example.dolly0920.item5.carstore.FerrariCarStore;

public class Main {
    public static void main(String[] args) {
        CarStore ferrariSt = new FerrariCarStore();
        CarStore BenzSt = new BenzCarStore();
        CarStore BuggaiSt = new BuggatiCarStore();

        Car premiumFerrari = ferrariSt.orderCar("premium");
        Car generalFerrari = ferrariSt.orderCar("general");
        Car premiumBenz = BenzSt.orderCar("premium");
        Car generalBenz = BenzSt.orderCar("general");
        Car premiumBuggati = BuggaiSt.orderCar("premium");
        Car generalBuggati = BuggaiSt.orderCar("general");
    }
}
