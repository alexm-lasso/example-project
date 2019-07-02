package com.example.myprog.kotlin.garage.parking

import com.example.myprog.kotlin.garage.CarKt

data class ParkingSpotKt(
        val length: Int,
        val width: Int,
        var car: CarKt?
) {

    /*
     * We can use "init" blocks to do checking or other stuff that would be done
     * in the constructor that is not field assignations.
     */
    init {
        if (length < 10) throw IllegalArgumentException("Length must be 10 or more.")
    }
}
