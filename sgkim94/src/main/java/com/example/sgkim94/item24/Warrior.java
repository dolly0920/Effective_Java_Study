package com.example.sgkim94.item24;

public class Warrior {
    private int power;

    public Warrior(int power) {
        this.power = power;
    }

    WowRunnable attack(int count) {
        class Command implements WowRunnable {
            @Override
            public Attack run() {
                return new Attack(count, power);
            }
        }

        return new Command();
    }
}
