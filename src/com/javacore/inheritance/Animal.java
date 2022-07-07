package com.javacore.inheritance;

import jdk.swing.interop.SwingInterOpUtils;

public class Animal {
    private String name;
    private int age;
    private float weight;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, float weight) {
        this(name);
        this.age = age;
        this.weight = weight;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight(float weight) {
        return weight;
    }

    void run(){
        System.out.println(getName()+"Con vat dang chay !!");
    }
}

class Cat extends Animal{
    private String color;
    private String favoriteFood;

    public Cat(){

    }

    public Cat(String color, String favoriteFood) {
        this.color = color;
        this.favoriteFood = favoriteFood;
    }

    public Cat(String name,int age,float weight,String color,String favoriteFood){
        super(name, age, weight);
        this.color=color;
        this.favoriteFood=favoriteFood;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    void catchMouse(){
        System.out.println(getName()+"Con meo dang bat chuot !!");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    void run() {
        super.run();
        System.out.println("con meo dang chay!!");
    }


}