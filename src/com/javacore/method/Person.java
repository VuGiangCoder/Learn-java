package com.javacore.method;

public class Person {
    private String id;
    private String fullName;
    private int age;
    private String address;

    public Person() {
        this.id = null;
        this.fullName = null;
        this.age = 0;
        this.address = null;
    }

    public Person(String id, String fullName) {
        this();
        this.id = id;
        this.fullName = fullName;
    }

    public Person(String id, String fullName, int age, String address) {
        this(id, fullName);
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!id.isEmpty()) {
            this.id = id;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (!fullName.isEmpty()) {
            this.fullName = fullName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
