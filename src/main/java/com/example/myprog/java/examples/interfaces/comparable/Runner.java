package com.example.myprog.java.examples.interfaces.comparable;

import com.example.myprog.java.garage.Car;
import com.example.myprog.java.garage.engines.CarEngine;

import java.util.Set;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {
        Car car1 = new Car(new CarEngine(100));
        Car car2 = new Car(new CarEngine(200));

        /*
         * TreeSet keeps the entries sorted according to the specified Comparator,
         * or uses natural ordering if we don't specify one.
         */
        Set<Car> cars = new TreeSet<>(new CarComparator());
        cars.add(car2);
        cars.add(car1);

        System.out.println(cars);
    }
}
