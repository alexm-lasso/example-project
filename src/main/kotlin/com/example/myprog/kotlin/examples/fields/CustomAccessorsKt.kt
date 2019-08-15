package com.example.myprog.kotlin.examples.fields

class CustomAccessorsKt(
        initialValue: Int
) {

    var value: Int = initialValue
        get() {
            println("the value is $field")
            return field
        }
        set(newValue) {
            println("the previous value is $field")
            println("the new value is $newValue")
            field = newValue
        }

    fun method() {
        var a = value
        value = 5
        // not possible to access the field directly
    }
}
