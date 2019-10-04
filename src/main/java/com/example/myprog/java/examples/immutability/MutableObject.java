package com.example.myprog.java.examples.immutability;

import java.util.ArrayList;
import java.util.List;

public class MutableObject {

    private String name;
    private List<Integer> numbers;

    public MutableObject() {}

    public MutableObject(String name, List<Integer> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

}

class MutableObjectRunner {

    public static void main(String[] args) {
        var obj = new MutableObject();
        obj.setName("");

        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        obj.setNumbers(list);

        // downside: object can still be modified afterwards
        var newList = List.of(1,2,3,4);
        obj.setNumbers(newList);
    }

}
