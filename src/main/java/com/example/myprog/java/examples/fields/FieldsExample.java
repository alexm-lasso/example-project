package com.example.myprog.java.examples.fields;

public class FieldsExample {

    /**
     * "Constants" can be defined using "static final" fields.
     * They could be public or private.
     */
    public static final int MY_CONSTANT = 5;

    /**
     * Class-level fields (static modifier only). Should rarely be needed.
     */
    private static int nextID = 0;

    /**
     * Object-specific final field with an initializer.
     * Not much different than a static-final in practice,
     * static-final should be preferred.
     */
    private final int finalFieldWithInitializer = 1;

    /**
     * Final field, expected to be set at the constructor
     * and never changed afterwards. The best type! :D
     */
    private final int finalField;

    /**
     * Mutable field, with an initializer for the initial value.
     */
    private int mutableFieldWithInitializer = 2;

    /**
     * Mutable field, initial value to bet set at constructor.
     */
    private int mutableField;

    public FieldsExample(int finalField, int mutableField) {
        this.finalField = finalField;
        this.mutableField = mutableField;
    }

    /* getters/setters... */
}
