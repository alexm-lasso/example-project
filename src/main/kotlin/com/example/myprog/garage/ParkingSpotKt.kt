package com.example.myprog.garage

class ParkingSpotKt(
        val length: Int,
        val width: Int,
        var car: Car?
) {

    /*
     * We can use "init" blocks to do checking or other stuff that would be done
     * in the constructor that is not field assignations.
     */
    init {
        if (length < 10) throw IllegalArgumentException("Length must be 10 or more.")
    }
}