package com.example.myprog.kotlin.garage

import com.example.myprog.java.garage.engines.Engine

abstract class MotorizedVehicleKt(
        open val engine: Engine
) : VehicleKt() {

    abstract fun method1()
}
