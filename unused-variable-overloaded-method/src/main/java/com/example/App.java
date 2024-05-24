package com.example;

public class App {
    private static class Base {
        protected void doStuff(String usedInDescendants) {}
    }

    private static class Descendant extends Base {
        @Override
        protected void doStuff(String usedInDescendants) {
            System.out.println(usedInDescendants);
        }
    }

    public static void main(String[] args) {
        Base b = new Descendant();

        b.doStuff("some string");
    }
}
