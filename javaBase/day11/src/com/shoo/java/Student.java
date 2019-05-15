package com.shoo.java;

public class Student extends Person {
    String major;

    public Student() {}

    public Student(String name, int age, String major) {
        this.name = name;
        setAge(age);
        this.major = major;
    }

    public void study() {
        System.out.println("学习");
    }

    public void show() {
        System.out.println("name: " + name + ", age:" + getAge());
    }
}
