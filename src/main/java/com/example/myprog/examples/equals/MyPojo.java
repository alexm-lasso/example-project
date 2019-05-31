package com.example.myprog.examples.equals;

import java.util.Objects;

public final class MyPojo {

    private final int field1;
    private final String field2;

    public MyPojo(int field1, final String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    @Override
    public String toString() {
        return "MyPojo[field1=" + field1 + ", field2=" + field2 + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPojo)) return false;
        MyPojo myPojo = (MyPojo) o;

        return field1 == myPojo.field1 &&
                Objects.equals(field2, myPojo.field2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, field2);
    }
}
