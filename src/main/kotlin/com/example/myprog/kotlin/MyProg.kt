package com.example.myprog.kotlin

import com.example.myprog.kotlin.garage.CarKt
import com.example.myprog.kotlin.garage.parking.ParkingSpotKt

fun main() {
    nullCheckingExamples()
}

fun nullCheckingExamples() {

    val mySpot = ParkingSpotKt<CarKt>(20, 10, null)

    /* Compiler error in Kotlin! */
//    mySpot.vehicle.sayHello()


    /* Null-checking */
    val theCarToCheck = mySpot.vehicle
    if (theCarToCheck != null) {
        theCarToCheck.sayHello() // JetBrains showing-off the smart-cast functionality :P
    }

    /* Using the "?." safe-dereference operator. */
    mySpot.vehicle?.sayHello()

    /* This can be paired with the Elvis operator "?:" */
    mySpot.vehicle?.sayHello() ?: println("The car is null!")
























    /* Quiz time! Why does this not work?? */
//    if (mySpot.car != null) {
//        mySpot.car.sayHello()
//    }
}