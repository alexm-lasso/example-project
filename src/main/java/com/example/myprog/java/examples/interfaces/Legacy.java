package com.example.myprog.java.examples.interfaces;

import java.io.Serializable;

public class Legacy {

    static class SerializableThing implements Serializable {

    }


    static class CloneableThing implements Cloneable {

        private int myInt1 = 0;
        private int myInt2 = 0;

        @Override
        protected CloneableThing clone() throws CloneNotSupportedException {
            CloneableThing newObject = (CloneableThing) super.clone();
            newObject.myInt1 = myInt1;
            newObject.myInt2 = myInt2;
            return newObject;
        }
    }

    static class BetterCloneableThing {

        private final int myInt1;
        private final int myInt2;

        BetterCloneableThing(int int1, int int2) {
            myInt1 = int1;
            myInt2 = int2;
        }

        /** Copy constructor */
        BetterCloneableThing(BetterCloneableThing other) {
            myInt1 = other.myInt1;
            myInt2 = other.myInt2;
        }

        /** Static copy method */
        static BetterCloneableThing copy(BetterCloneableThing other) {
            return new BetterCloneableThing(other.myInt1, other.myInt2);
        }
    }

    public static void main(String[] args) throws Exception {

        CloneableThing object1 = new CloneableThing();
        CloneableThing object2 = object1.clone();

        BetterCloneableThing object3 = new BetterCloneableThing(1, 2);
        BetterCloneableThing object4 = new BetterCloneableThing(object3);
        BetterCloneableThing object5 = BetterCloneableThing.copy(object3);
    }
}
