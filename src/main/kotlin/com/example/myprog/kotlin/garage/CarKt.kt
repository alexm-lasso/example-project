package com.example.myprog.kotlin.garage

import com.example.myprog.java.garage.engines.CarEngine

class CarKt(
        // in Kotlin we just override the property, which takes care of field/getter/setter/ctor param
        override val engine: CarEngine
) : MotorizedVehicleKt(4, engine) {

    fun sayHello() {
        println("Hello world from CarKt!")
    }

    override fun method1() {
        println("this is method1 from MotorizedVehicle")
    }
}
