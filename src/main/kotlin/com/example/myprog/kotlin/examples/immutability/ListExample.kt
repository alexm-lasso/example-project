package com.example.myprog.kotlin.examples.immutability

fun main() {

    var list1: List<Int> = listOf(1, 2, 3)
    for (i: Int in 4..15) {
        list1 = list1.plus(1)
        // List has a plus() method but this actually creates new lists every time! :O
    }

    // Better to use a MutableList in this case:
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)
    for (i: Int in 4..15) {
        list2.add(i)
    }

    val list3: List<Int> = list2 // read-only reference to the same list
    println(list3)
}
