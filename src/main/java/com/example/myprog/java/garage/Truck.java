package com.example.myprog.java.garage;

import com.example.myprog.java.garage.engines.Engine;

public class Truck extends MotorizedVehicle {

    public Truck(int nbWheels, Engine engine) {
        super(nbWheels, engine);
    }

    @Override
    public void method1() {
        System.out.println("this is method1 from Truck");
    }
}
