package com.example.myprog.garage;

import org.jetbrains.annotations.Nullable;

public class ParkingSpot {

    private final int length;
    private final int width;

    @Nullable
    private Car car;

    public ParkingSpot(int length, int width, @Nullable Car car) {
        /* Argument checking, typically done first thing inside a method. */
        if (length < 10) throw new IllegalArgumentException("Length must be 10 or more.");

        this.length = length;
        this.width = width;
        this.car = car;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Nullable
    public Car getCar() {
        return car;
    }

    public void setCar(@Nullable Car car) {
        this.car = car;
    }

}
