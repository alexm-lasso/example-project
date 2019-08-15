package com.example.myprog.java.examples.fields;

import com.google.common.io.Files;
import kotlin.text.Charsets;

import java.io.File;
import java.io.IOException;

public class VirtualField {

    public int getValue() throws IOException {
        // read value from disk, DB, etc.
        return Integer.valueOf(Files.readLines(new File("/home/user/file"), Charsets.UTF_8).get(0));
    }

    public void setValue(int newValue) {
        // write value to disk, DB, etc.

    }
}
