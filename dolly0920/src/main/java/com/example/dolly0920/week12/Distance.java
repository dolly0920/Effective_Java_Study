package com.example.dolly0920.week12;

public enum Distance {
    EAST(1),
    WEST(2),
    SOUTH(3),
    NORTH(4);

    private final int direction;

    Distance(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return this.direction;
    }
}
