package com.example.myprog.java.garage;

public class Vehicle {

    private final int nbWheels;

    public Vehicle(int nbWheels) {
        this.nbWheels = nbWheels;
    }

    public final int getNbWheels() {
        return nbWheels;
    }
}
