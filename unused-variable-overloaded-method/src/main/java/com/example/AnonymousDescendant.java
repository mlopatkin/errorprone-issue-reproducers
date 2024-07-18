package com.example;

public class AnonymousDescendant {
    private interface Base {
        default void doStuff(String usedInDescendants) {}
    }

    public static void main(String[] args) {
        Base b = new Base() {
            @Override
            public void doStuff(String actuallyUsed) {
                System.out.println(actuallyUsed);
            }
        };

        b.doStuff("some string");
    }
}
