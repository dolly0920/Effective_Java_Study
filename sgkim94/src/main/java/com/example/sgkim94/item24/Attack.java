package com.example.sgkim94.item24;

class Attack implements Command {
    private int count;
    private int power;

    Attack(int count, int power) {
        this.count = count;
        this.power = power;
    }

    public int retrieveDamage() {
        return count * power;
    }
}
