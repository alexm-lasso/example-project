package com.example.myprog.java.garage;

import com.example.myprog.java.garage.engines.CarEngine;

public final class Car extends MotorizedVehicle {

    /**
     * This is the constructor
     */
    public Car(CarEngine engine) {
        super(4, engine);
    }

    @Override
    public CarEngine getEngine() {
        return (CarEngine) super.getEngine();
    }

    /**
     * This is a method to say hello.
     */
    public void sayHello() {
        System.out.println("Hello world from Car!");
    }

    @Override
    public void method1() {
        System.out.println("this is method1 from Car");
    }

}
