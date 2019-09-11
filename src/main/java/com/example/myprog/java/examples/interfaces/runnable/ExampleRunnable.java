package com.example.myprog.java.examples.interfaces.runnable;

public class ExampleRunnable implements Runnable {

    private final int threadNb;

    public ExampleRunnable(int threadNb) {
        this.threadNb = threadNb;
    }

    @Override
    public void run() {
        System.out.println("This is thread " + threadNb);
    }
}
