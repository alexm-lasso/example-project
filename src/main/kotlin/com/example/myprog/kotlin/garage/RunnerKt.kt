package com.example.myprog.kotlin.garage

import com.example.myprog.java.garage.engines.Engine
import com.example.myprog.java.garage.Vehicle

fun main() {

    val vehicle: Vehicle = CarKt(Engine(200))


    if (vehicle is CarKt) {
        vehicle.sayHello()
    }
}
