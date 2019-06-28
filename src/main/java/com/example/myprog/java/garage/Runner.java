package com.example.myprog.java.garage;

import com.example.myprog.java.garage.engines.Engine;

public class Runner {

    public static void main(String[] args) {
//        referencesExample();
        behaviourFromObjectType();
    }

    private static void referencesExample() {
        Engine engine = new Engine(200);

        Vehicle vehicle = new Car(engine);
        MotorizedVehicle motorizedVehicle = new Car(engine);
        Car car = new Car(engine);

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
        Engine engine = new Engine(200);

        Vehicle vehicle = new Car(engine);
        Car car = new Car(engine);

        car.sayHello();
//        vehicle.sayHello();

        if (vehicle instanceof Car) {
            ((Car) vehicle).sayHello();
        }
        // smart casts in Kotlin...
    }

    private static void behaviourFromObjectType() {
        Engine engine = new Engine(200);
        MotorizedVehicle motorizedVehicle = new Car(engine);
        Car car = new Car(engine);

        motorizedVehicle.method1();
        car.method1();
    }
}
