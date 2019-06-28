package com.example.myprog.java;

import com.example.myprog.java.garage.Car;
import com.example.myprog.java.garage.ParkingSpot;
import com.example.myprog.kotlin.garage.ParkingSpotKt;

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
        ParkingSpot mySpot = new ParkingSpot(20, 10, null);
        mySpot.getCar().sayHello();

        /* Kotlin version, bytecode also gets an equivalent annotation. */
        ParkingSpotKt mySpotKt = new ParkingSpotKt(20, 10, null);
        mySpotKt.getCar().sayHello();

        /* Worked around by null-checking a local variable. Safe! */
        Car theCarToCheck = mySpot.getCar();
        if (theCarToCheck != null) {
            theCarToCheck.sayHello();
        } else {
            System.out.println("The car is null!");
        }
    }

}

