package com.example.sypark9646.item20;

import com.example.sypark9646.item20.simulated_multiple_inheritance.Pizza;
import com.example.sypark9646.item20.simulated_multiple_inheritance.PizzaTruck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimulatedMultipleInheritanceTest {

    @DisplayName("simulated multiple inheritance 테스트")
    @Test
    void pizzaTruckTest() {
        PizzaTruck pizzaTruck = new PizzaTruck();
        Pizza pizza = new Pizza();

        pizzaTruck.turnLightOn();
        pizzaTruck.cook(pizza);
        pizzaTruck.turnLightOff();
        pizzaTruck.driveTo("home");
    }
}
