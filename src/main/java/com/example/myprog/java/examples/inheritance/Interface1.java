package com.example.myprog.java.examples.inheritance;

interface Interface1 {

    void method1();

    void method2(int param);

    void method5();

    default void method4() {
        // do something
    }
}
