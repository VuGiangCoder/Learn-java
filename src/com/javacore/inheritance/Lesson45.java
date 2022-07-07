package com.javacore.inheritance;

public class Lesson45 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat("Tom", 18, 2.0f, "yellow", "fish");  //ep len
        cat.getName();
        if (cat instanceof Cat) {
            Cat tom = (Cat) cat; //ep xuong
        }
    }
}
