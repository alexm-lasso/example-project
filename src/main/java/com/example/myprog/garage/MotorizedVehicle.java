package com.example.myprog.garage;

public class MotorizedVehicle extends Vehicle {

    private final Engine engine;

    public MotorizedVehicle(int nbWheels, Engine engine) {
        super(nbWheels);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
