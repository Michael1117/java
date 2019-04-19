package com.hefeng.www.www;

public class Student extends Person {

    String name;
    int age;
    String major;

    public Student() {

    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void eat() {
        System.out.println("Student.eat");
    }

    public void sleep() {
        System.out.println("Student.sleep");
    }

    public void study() {
        System.out.println("Student.study");
    }

    public void show() {
        System.out.println("name:" + name + "age: " + age);
    }
}
