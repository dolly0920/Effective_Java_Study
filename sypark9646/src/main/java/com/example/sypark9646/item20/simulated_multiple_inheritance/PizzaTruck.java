package com.example.sypark9646.item20.simulated_multiple_inheritance;

public class PizzaTruck extends Truck implements Kitchen {

    private final InnerAbstractKitchen innerAbstractKitchen = new InnerAbstractKitchen();

    @Override
    public void cook(Food food) {
        innerAbstractKitchen.cook(food);
    }

    @Override
    public void turnLightOn() {
        innerAbstractKitchen.turnLightOn();
    }

    @Override
    public void turnLightOff() {
        innerAbstractKitchen.turnLightOff();
    }

    private static class InnerAbstractKitchen extends AbstractKitchen {

        @Override
        public void cook(Food food) {
            System.out.println("cook " + food.getClass().getSimpleName());
        }
    }
}
