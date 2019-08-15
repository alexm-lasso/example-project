package com.example.myprog.java.garage.parking;

import com.example.myprog.java.garage.Vehicle;
import org.jetbrains.annotations.Nullable;

/**
 *
 * @param <T> Type of vehicle that goes into the parking spot.
 */
public class ParkingSpot<T extends Vehicle> {

    private final int length;
    private final int width;

    private final transient int area;

    private T vehicle;

    public ParkingSpot(int length, int width, T car) {
        /* Argument checking, typically done first thing inside a method. */
        if (length < 10) throw new IllegalArgumentException("Length must be 10 or more.");

        this.length = length;
        this.width = width;
        this.vehicle = car;

        this.area = length * width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Nullable
    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
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
        return vehicle != null ? vehicle.equals(that.vehicle) : that.vehicle == null;

    }

    @Override
    public int hashCode() {
        int result = length;
        result = 31 * result + width;
        result = 31 * result + (vehicle != null ? vehicle.hashCode() : 0);
        return result;
    }
}
