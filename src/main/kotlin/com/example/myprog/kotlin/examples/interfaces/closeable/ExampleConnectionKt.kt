package com.example.myprog.kotlin.examples.interfaces.closeable

class ExampleConnectionKt : AutoCloseable {

    companion object {
        fun example() {
            ExampleConnectionKt().use { connection ->
                connection.doSomething()
                // close() gets called automatically at the end of the block
            }
            // no checked exceptions in Kotlin, so no special try-catch syntax
        }
    }

    init {
        // open DB connection
    }

    override fun close() {
        // close DB connection
    }

    fun doSomething() {

    }
}
