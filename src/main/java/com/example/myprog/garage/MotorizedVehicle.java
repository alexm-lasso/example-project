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

    public void method1() {
        System.out.println("this is method1 from MotorizedVehicle");
    }

}
