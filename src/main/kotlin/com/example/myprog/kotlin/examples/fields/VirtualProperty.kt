package com.example.myprog.kotlin.examples.fields

class VirtualProperty {

    var value: Int
        get() {
            // read from disk
            return 0
        }
        set(newValue) {
            // write to disk
        }

    fun method() {
        val a = value
        value = 5
    }
}
