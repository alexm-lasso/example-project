package com.example.myprog.java.examples.inheritance;

class MyClass extends AbstractClass1 implements Interface1, Interface2 {

    @Override
    public void method1() {
        // here
    }

    @Override
    public void method2(int param) {

    }

    @Override
    public void method5() {
        // here
    }


    // Need to resolve this clash!
    @Override
    public void method4() {
        Interface2.super.method4();
    }

}
