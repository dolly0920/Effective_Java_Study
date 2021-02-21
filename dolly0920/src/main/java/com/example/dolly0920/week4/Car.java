package com.example.dolly0920.week4;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Car {
    private final int id;
    private final int speed;
    private final int stability;

    @Override
    public boolean equals(Object o) {
        if (o == this) { // previous equals method
            return true;
        }
        if (o == null) { // always return false when parameter is null value
            return false;
        }
        // instanceof : [reference type] instance of [class] : return [boolean]
        if (!(o instanceof Car)) { // different class => return false
            return false;
        }
        Car c = (Car) o; // type change
        return this.id == c.id && this.speed == c.speed && this.stability == c.stability;
    }
}
