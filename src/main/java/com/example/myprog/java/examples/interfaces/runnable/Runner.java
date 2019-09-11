package com.example.myprog.java.examples.interfaces.runnable;

public class Runner {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExampleRunnable(1));
        Thread t2 = new Thread(new ExampleRunnable(2));

        t1.start();
        t2.start();
    }
}
