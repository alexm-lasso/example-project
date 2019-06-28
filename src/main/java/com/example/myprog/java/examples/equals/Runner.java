package com.example.myprog.java.examples.equals;

public class Runner {

    public static void main(String[] args) {
        MyPojo object1 = new MyPojo(1, "hello");
        MyPojo object2 = new MyPojo(1, "hello");

        System.out.println(object1);
        System.out.println(object2);

        System.out.println(object1 == object2);
        System.out.println(object1.equals(object2));
    }
}
