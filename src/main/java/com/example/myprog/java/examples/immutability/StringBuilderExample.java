package com.example.myprog.java.examples.immutability;

import com.google.common.collect.ImmutableList;

public class StringBuilderExample {

    public static void main(String[] args) {
        buildAnImmutableList();
    }

    private static void replacementExample() {
        String a = "this is a string!";
        // replace() does not modify 'a', it returns a new string
        var b = a.replace("!", "?");

        System.out.println(a);
        System.out.println(b);
    }

    private static void buildingAString() {
        /*
         * Create a string with numbers from 1 to 1000 and commas in-between
         * "1, 2, 3, ... 1000"
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 999; i++) {
            sb.append(i);
            sb.append(", ");
            // doing 'string = string + i + "1, "' would create 3 new string objects every iteration of the loop!
        }
        sb.append(1000);
        String string = sb.toString();

        System.out.println(string);
    }

    private static void buildAnImmutableList() {
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        for (int i = 1; i <= 1000; i++) {
            builder.add(i);
        }
        ImmutableList<Integer> list = builder.build();

        System.out.println(list);
    }
}
