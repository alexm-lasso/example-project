package com.example.myprog.java.examples.interfaces.closeable;

import java.io.IOException;

public class ExampleConnection implements AutoCloseable {

    public ExampleConnection() throws IOException {
        // open a connection to the DB
    }

    @Override
    public void close() throws IOException {
        // close the DB connection
    }

    public void doSomething() throws IOException {

    }
}
