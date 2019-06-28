package com.example.myprog.garage

fun main() {

    val vehicle: Vehicle = CarKt(Engine(200))


    if (vehicle is CarKt) {
        vehicle.sayHello()
    }
}
