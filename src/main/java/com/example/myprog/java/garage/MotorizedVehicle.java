package com.example.myprog.java.garage;

import com.example.myprog.java.garage.engines.Engine;

public abstract class MotorizedVehicle extends Vehicle {

    private final Engine engine;

    public MotorizedVehicle(int nbWheels, Engine engine) {
        super(nbWheels);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void method1();

}
