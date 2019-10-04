package com.example.myprog.kotlin.examples.immutability

class ImmutableObject(val name: String, numbers: List<Int>) {

    /*
     * Let's say we want to modify 'numbers' internally in several places,
     * it's more convenient to save it as a MutableList.
     */
    private val numbers: MutableList<Int> = numbers.toMutableList()

    /* Then we can decide to expose only the 'List' interface so callers cannot modify the list */
    fun getNumbers(): List<Int> {
        return numbers
    }
}
