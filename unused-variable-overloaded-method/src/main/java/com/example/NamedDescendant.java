package com.example;

public class NamedDescendant {
    private interface Base {
        default void doStuff(String usedInDescendants) {}
    }

    private static class Descendant implements Base {
        @Override
        public void doStuff(String actuallyUsed) {
            System.out.println(actuallyUsed);
        }
    }

    public static void main(String[] args) {
        Base b = new Descendant();

        b.doStuff("some string");
    }
}
