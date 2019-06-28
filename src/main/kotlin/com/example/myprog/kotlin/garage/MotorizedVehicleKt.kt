package com.example.myprog.kotlin.garage

import com.example.myprog.java.garage.Engine
import com.example.myprog.java.garage.Vehicle

open class MotorizedVehicleKt(
        nbWheels: Int,
        val engine: Engine
) : Vehicle(nbWheels) {

    open fun method1() {
        println("this is method1 from MotorizedVehicle")
    }
}
