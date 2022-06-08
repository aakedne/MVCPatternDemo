package com.example;

public class Student {
    // fields
    private String rollno;
    private String name;

    //No args constructor
    public Student() {
    }
    // All args constructor
    public Student(String rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    //Getters and setters

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
