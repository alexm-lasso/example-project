package com.example.myprog.kotlin.garage

import com.example.myprog.java.garage.Vehicle
import com.example.myprog.java.garage.engines.Engine

open class MotorizedVehicleKt(
        nbWheels: Int,
        open val engine: Engine
) : Vehicle(nbWheels) {

    open fun method1() {
        println("this is method1 from MotorizedVehicle")
    }
}
