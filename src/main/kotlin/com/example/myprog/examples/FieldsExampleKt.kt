package com.example.myprog.examples

/**
 * Properties can be defined at the top-level!
 */
const val MY_CONSTANT_1: Int = 5

class FieldsExampleKt(
        /**
         * Final property, expected to be set at the constructor
         * and never changed afterwards. The best type! :D
         */
        val finalProperty: Int,
        /**
         * Mutable property, initial value to bet set at constructor.
         */
        var mutableField: Int
) {

    /**
     * "static" doesn't exist in Kotlin, the close-enough equivalent
     * is a companion object.
     */
    companion object {
        /**
         * "Constants" can be defined either as top-level vals, or inside companion objects.
         * Use the "const" modifier whenever you can...
         */
        const val MY_CONSTANT_2: Int = 5

        /**
         * Class-level mutable property.
         */
        private var nextID: Int = 0
    }

    /**
     * Immutable property with an initializer.
     * While Java strongly prefers "static final" for this,
     * in Kotlin both are acceptable.
     */
    val finalPropertyWithInitializer: Int = 1

    /**
     * Mutable property, with an initializer for the initial value.
     */
    private var mutableFieldWithInitializer: Int = 2

}