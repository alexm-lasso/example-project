package com.example.myprog

import com.example.myprog.garage.Car
import com.example.myprog.garage.ParkingSpotKt

fun main() {
    nullCheckingExamples()
}

fun nullCheckingExamples() {
    val myCar = Car()

    val mySpot = ParkingSpotKt(20, 10, null)

    /* Compiler error in Kotlin! */
//    mySpot.car.sayHello()


    /* Null-checking */
    val theCarToCheck = mySpot.car
    if (theCarToCheck != null) {
        theCarToCheck.sayHello() // JetBrains showing-off the smart-cast functionality :P
    }

    /* Using the "?." safe-dereference operator. */
    mySpot.car?.sayHello()

    /* This can be paired with the Elvis operator "?:" */
    mySpot.car?.sayHello() ?: println("The car is null!")
























    /* Quiz time! Why does this not work?? */
//    if (mySpot.car != null) {
//        mySpot.car.sayHello()
//    }
}