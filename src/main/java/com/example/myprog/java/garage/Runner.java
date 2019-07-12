package com.example.myprog.java.garage;

import com.example.myprog.java.garage.engines.CarEngine;
import com.example.myprog.java.garage.parking.Driveway;
import com.example.myprog.java.garage.parking.ParkingSpot;

public class Runner {

    public static void main(String[] args) {
//        referencesExample();
//        behaviourFromObjectType();

        Vehicle vehicle = new Car(new CarEngine(200));
        Car car = new Car(new CarEngine(200));
        ParkingSpot<Car> spot = new ParkingSpot<>(20, 10, null);
        spot.setVehicle(car);
        var ref = spot.getVehicle();

        Driveway dw = new Driveway(10, 10, null);
        spot.setVehicle(car);
        var ref2 = spot.getVehicle();
    }

    private static void referencesExample() {
        Vehicle vehicle = new Car(new CarEngine(200));
        MotorizedVehicle motorizedVehicle = new Car(new CarEngine(200));
        Car car = new Car(new CarEngine(200));

        System.out.println(vehicle instanceof Vehicle);
        System.out.println(vehicle instanceof MotorizedVehicle);
        System.out.println(vehicle instanceof Car);
        System.out.println();

        System.out.println(motorizedVehicle instanceof Vehicle);
        System.out.println(motorizedVehicle instanceof MotorizedVehicle);
        System.out.println(motorizedVehicle instanceof Car);
        System.out.println();

        System.out.println(car instanceof Vehicle);
        System.out.println(car instanceof MotorizedVehicle);
        System.out.println(car instanceof Car);
        System.out.println();
    }


    private static void castingExample() {
        Vehicle vehicle = new Car(new CarEngine(200));
        Car car = new Car(new CarEngine(200));

        car.sayHello();
//        vehicle.sayHello();

        if (vehicle instanceof Car) {
            ((Car) vehicle).sayHello();
        }
        // smart casts in Kotlin...
    }

    private static void behaviourFromObjectType() {
        MotorizedVehicle motorizedVehicle = new Car(new CarEngine(200));
        Car car = new Car(new CarEngine(200));

        motorizedVehicle.method1();
        car.method1();

        CarEngine engine = car.getEngine();
    }
}
