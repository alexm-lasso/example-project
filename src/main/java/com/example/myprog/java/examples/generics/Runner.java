package com.example.myprog.java.examples.generics;

import com.example.myprog.java.garage.Car;
import com.example.myprog.java.garage.MotorizedVehicle;
import com.example.myprog.java.garage.Vehicle;
import com.example.myprog.java.garage.engines.CarEngine;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    private static void referenceJuggling() {
        CarEngine engine = new CarEngine(200);
        Car a = new Car(engine); // car #1
        Car b = new Car(engine); // car #2
        Car c = new Car(engine); // car #3

        c = a; // 'c' now points to car #1
        // No more references to car #3, it can be garbage-collected.

        a = new Car(engine); // car #4
        // 'c' still points to car #1! (it doesn't "follow 'a' around")
        c = a; // c now points to car #4 too
        // No more references to car #1 now, it can be garbage-collected.
    }

    private static void genericTypeChecking() {
        List<String> a = new ArrayList<>();

        /* .add() takes a String type here */
        a.add("this is the first string");
        a.add("this is the second string");
//        a.add(1); // error!

        /* get() returns a String too. */
        String myString = a.get(0);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4);
        MotorizedVehicle motorizedVehicle = new Car(new CarEngine(200));
        Car car = new Car(new CarEngine(200));

        List<Vehicle> listOfVehicles = new ArrayList<>();
        listOfVehicles.add(vehicle);
        listOfVehicles.add(motorizedVehicle);
        listOfVehicles.add(car);

        /* List.get() returns type 'Vehicle' */
        Vehicle element = listOfVehicles.get(2);

        System.out.println(listOfVehicles);

        /*
         Method takes a 'Vehicle' but we can pass a 'Car' (gets "upcasted" automatically)
         because "a Car is necessarily a Vehicle".
         */
        myMethod(car);

        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Car(new CarEngine(100)));

        myMethod2(listOfVehicles);

        listOfVehicles.add(new Vehicle(4));
        Vehicle e = listOfVehicles.get(0);

        /*
         Is a List<Car> an acceptable substitute for a List<Vehicle> ???
         Perhaps unexpected, but the answer is NO!

         This would not compile:
         listOfCars.add(new Vehicle(4)));
         */
//        myMethod2(listOfCars);


        // wilcard type ("list of whatever")
        List<?> listOfThings = new ArrayList<>();
        List<Object> listOfObjects = new ArrayList<>();

        /* A method that takes a wildcard type accepts all lists */
        myMethod3(listOfCars);
        myMethod3(listOfVehicles);
        myMethod3(listOfThings);
        myMethod3(listOfObjects);

        /* Bounded wildcard, now we can substitute with a List<Car> like we tried to do earlier. */
        myMethod4(listOfVehicles);
        myMethod4(listOfCars);
    }

    private static void myMethod(Vehicle vehicle) {
        // We only have access to the functions from 'Vehicle' here,
        // no matter what actual type was passed.
        // of course we could use instanceof + casting...
//        vehicle.
    }

    private static void myMethod2(List<Vehicle> list) {
        list.add(new Vehicle(4));
        Vehicle e = list.get(0);
    }

    private static void myMethod3(List<?> list) {
        Object e = list.get(0);
    }

    /**
     * Use with caution!!!
     */
    private static void myMethod4(List<? extends Vehicle> list) {
        Vehicle e = list.get(0);
//        list.add(new Vehicle(4)); // cryptic error messages...
    }

    /**
     * Use with caution!!!
     */
    private static void myMethod5(List<? super Car> list) {
//        list.add(new Vehicle(4));
    }


    /**
     * Method-specific type parameter.
     */
    public static <U> U printTheThing(U u) {
        System.out.println(u.toString());
        return u;
    }

    /**
     * Method-specific type parameters can have bounds too.
     */
    public static <V extends Vehicle> V printTheVehicle(V v) {
        System.out.println(v.toString() + ", number of wheels=" + v.getNbWheels());
        return v;
    }
}
