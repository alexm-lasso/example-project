package com.example.myprog.garage;

import org.jetbrains.annotations.Nullable;

public class ParkingSpot {

    private final int length;
    private final int width;

    private final transient int area;

    private Car car;

    private boolean isEmpty;

    public ParkingSpot(int length, int width, Car car) {
        /* Argument checking, typically done first thing inside a method. */
        if (length < 10) throw new IllegalArgumentException("Length must be 10 or more.");

        this.length = length;
        this.width = width;
        this.car = car;

        this.area = length * width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(@Nullable Car car) {
        this.car = car;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkingSpot)) return false;

        ParkingSpot that = (ParkingSpot) o;

        if (length != that.length) return false;
        if (width != that.width) return false;
        if (isEmpty != that.isEmpty) return false;
        return car != null ? car.equals(that.car) : that.car == null;

    }

    @Override
    public int hashCode() {
        int result = length;
        result = 31 * result + width;
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (isEmpty ? 1 : 0);
        return result;
    }
}
