package com.example.dolly0920.item10;

public class Main {
    public static void main(String[] args) {
        People p1 = new People("Chickenrun", 30, 70, 180);
        People p2 = new People("Chickenrun", 30, 70, 100);

        Spaceship s1 = new Spaceship("voyager", 1000, 500);
        Spaceship s2 = new Spaceship("voyager", 1000, 500);

        System.out.println(p1.equals(p2)); // not define equals method
        System.out.println(s1.equals(s2)); // define equals method
    }
}
