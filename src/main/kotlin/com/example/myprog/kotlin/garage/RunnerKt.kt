package com.example.myprog.kotlin.garage

import com.example.myprog.java.garage.engines.CarEngine

fun main() {

    val vehicle: VehicleKt = CarKt(CarEngine(200))

    if (vehicle is CarKt) {
        vehicle.sayHello()
        vehicle.engine // type is CarEngine
    }
}
