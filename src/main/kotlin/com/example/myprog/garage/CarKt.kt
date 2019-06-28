package com.example.myprog.garage

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
