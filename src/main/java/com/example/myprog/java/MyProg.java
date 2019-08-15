package com.example.myprog.java;

import com.example.myprog.java.garage.Car;
import com.example.myprog.java.garage.parking.ParkingSpot;
import com.example.myprog.kotlin.garage.CarKt;
import com.example.myprog.kotlin.garage.parking.ParkingSpotKt;

public class MyProg {

    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        nullCheckingExamples();
    }

    private static void nullCheckingExamples() {

        /* Null dereference, warning due to Java @Nullable annotation. */
        ParkingSpot<Car> mySpot = new ParkingSpot<>(20, 10, null);
        mySpot.getVehicle().sayHello();

        /* Kotlin version, bytecode also gets an equivalent annotation. */
        ParkingSpotKt<CarKt> mySpotKt = new ParkingSpotKt<>(20, 10, null);
        mySpotKt.getVehicle().sayHello();

        /* Worked around by null-checking a local variable. Safe! */
        Car theCarToCheck = mySpot.getVehicle();
        if (theCarToCheck != null) {
            theCarToCheck.sayHello();
        } else {
            System.out.println("The car is null!");
        }
    }

}

