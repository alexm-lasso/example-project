package com.example.myprog.java.examples.fields;

public class CustomAccessors {

    private int value = 0;

    public int getValue() {
        System.out.println("the value is " + value);
        return value;
    }

    protected void setValue(int newValue) {
        System.out.println("the previous value is " + value);
        System.out.println("the new value is " + newValue);
        value = newValue;
    }

    public void method() {
        var a = value; // direct access to the field, bypassing the getter!
        var b = getValue();
    }
}
