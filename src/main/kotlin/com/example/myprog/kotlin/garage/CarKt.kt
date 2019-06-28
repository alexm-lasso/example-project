package com.example.myprog.kotlin.garage

import com.example.myprog.java.garage.Engine

class CarKt(
        engine: Engine
) : MotorizedVehicleKt(4, engine) {

    fun sayHello() {
        println("Hello world from CarKt!")
    }

    override fun method1() {
        println("this is method1 from MotorizedVehicle")
    }
}
