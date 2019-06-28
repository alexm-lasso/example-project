package com.example.myprog.garage

open class MotorizedVehicleKt(
        nbWheels: Int,
        val engine: Engine
) : Vehicle(nbWheels) {

    open fun method1() {
        println("this is method1 from MotorizedVehicle")
    }
}
