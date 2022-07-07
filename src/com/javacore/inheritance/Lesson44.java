package com.javacore.inheritance;

public class Lesson44 {
    public static void main(String[] args) {
        Cat tom = new Cat("yellow","fish");
        tom.setName("Tom");
        tom.run();

        Cat dog = new Cat("Dog",18,13,"yelow","fish");
        dog.run();
    }
}
