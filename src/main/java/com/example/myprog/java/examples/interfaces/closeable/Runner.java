package com.example.myprog.java.examples.interfaces.closeable;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) {
        /* try-with-resources syntax */
        try (ExampleConnection connection1 = new ExampleConnection();
             ExampleConnection connection2 = new ExampleConnection()) {

            connection1.doSomething();
            connection2.doSomething();

            /*
             * connection2.close() then connection1.close() will get called automatically
             * once we go out of scope, either normally or if an exception is thrown.
             */
        } catch (IOException e) {
            /*
             * This catch will catch any exception thrown by the initializers (constructor calls),
             * the code block (doSomething()) and automatic close() calls.
             */
        }


        /* Pre Java 7, good practice was rather ugly: */
        ExampleConnection connection3 = null;
        try {
            connection3 = new ExampleConnection();
            connection3.doSomething();
        } catch (IOException e) {
            // handle error in the block
        } finally {
            try {
                if (connection3 != null) {
                    connection3.close();
                }
            } catch (IOException e) {
                // handle error on close()
            }
        }
    }
}
