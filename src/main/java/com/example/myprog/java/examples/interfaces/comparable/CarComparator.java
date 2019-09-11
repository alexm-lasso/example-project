package com.example.myprog.java.examples.interfaces.comparable;

import com.example.myprog.java.garage.Car;

import java.util.Comparator;

/**
 * A Comparator<T> is usually a separate object from the "T" type that defines
 * the logic to compare T objects.
 */
public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getEngine().getHorsePower(), o2.getEngine().getHorsePower());
    }
}
