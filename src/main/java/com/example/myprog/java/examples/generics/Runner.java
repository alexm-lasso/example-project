package com.example.myprog.java.examples.generics;

import com.example.myprog.java.garage.Car;
import com.example.myprog.java.garage.engines.Engine;
import com.example.myprog.java.garage.MotorizedVehicle;
import com.example.myprog.java.garage.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<String> a = new ArrayList<>();

        String string1 = "this is the first string";
        String string2 = "this is the second string";
        Integer int1 = 1;

        a.add(string1);
        a.add(string2);

        String myString = a.get(0);

        System.out.println(a);


        Engine engine = new Engine(200);
        Vehicle vehicle = new Car(engine);
        MotorizedVehicle motorizedVehicle = new Car(engine);
        Car car = new Car(engine);

        List<Vehicle> list = new ArrayList<>();
        list.add(vehicle);
        list.add(motorizedVehicle);
        list.add(car);

        var element = list.get(2);
    }
}
