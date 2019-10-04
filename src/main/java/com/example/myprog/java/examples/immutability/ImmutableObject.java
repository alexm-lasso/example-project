package com.example.myprog.java.examples.immutability;

import java.util.ArrayList;
import java.util.List;

public class ImmutableObject {

    private final String name;
    private final List<Integer> numbers;

    public ImmutableObject(String name, List<Integer> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    // Exposing this would allow callers to modify the List!
//    public List<Integer> getNumbers() {
//        return numbers;
//    }

    // better to only expose what we need, for example:

    public Integer getNumber(int index) {
        return numbers.get(index);
    }

    public int getNumbersSize() {
        return numbers.size();
    }

}

class ImmutableObjectRunner {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        var a = new ImmutableObject("someone", list);

        a.getNumber(1);
    }
}
