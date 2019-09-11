package com.example.myprog.java.examples.interfaces.comparable;

import com.example.myprog.java.garage.MotorizedVehicle;
import com.example.myprog.java.garage.engines.CarEngine;
import org.jetbrains.annotations.NotNull;

/**
 * Making a class Comparable defines the "natural ordering" for objects of this class.
 */
public final class ComparableCar extends MotorizedVehicle implements Comparable<ComparableCar> {

    /**
     * This is the constructor
     */
    public ComparableCar(CarEngine engine) {
        super(4, engine);
    }

    @Override
    public CarEngine getEngine() {
        return (CarEngine) super.getEngine();
    }

    @Override
    public void method1() {
        System.out.println("this is method1 from ComparableCar");
    }

    @Override
    public int compareTo(@NotNull ComparableCar o) {
        if (this.getEngine().getHorsePower() < o.getEngine().getHorsePower()) {
            return -1;
        } else if (this.getEngine().getHorsePower() > o.getEngine().getHorsePower()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "[" + getEngine().getHorsePower() + "]";
    }
}
