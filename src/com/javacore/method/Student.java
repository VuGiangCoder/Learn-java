package com.javacore.method;

public class Student {
    // thuoc tinh
    public String studentId;
    public String fullname;
    public int age;
    public float avgGrade;

    //constructor
    private Student(){
        studentId ="";
        fullname="";
    }//khoi tao mac dinh
    protected Student(String Id){
        this();
        this.studentId=Id;
    }
    public Student (String Id, String name){
        this(Id);
        this.studentId = Id;
        this.fullname=name;
    }

    //method

    public void doExam(String subject){
        System.out.println("Dang lam: "+subject);
    }
}
