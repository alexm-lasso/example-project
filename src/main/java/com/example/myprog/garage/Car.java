package com.example.myprog.garage;

public class Car extends MotorizedVehicle {

  /** This is the constructor */
  public Car(Engine engine) {
    super(4, engine);
  }

  /**
   * This is a method to say hello.
   */
  public void sayHello() {
    System.out.println("Hello world from Car!");
  }

}
