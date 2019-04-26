package com.example.myprog;

public class MyProg {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car myCar = new Car();
        myCar.sayHello();
    }

    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

}

