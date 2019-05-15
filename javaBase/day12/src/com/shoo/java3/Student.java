package com.shoo.java3;

public class Student extends Person {
    String major;
    int id = 1002;

    public Student() {}

    public Student(String major) {
        super();
        this.major = major;
    }

    public Student(String name, int age ,String major) {
        super(name, age);
        this.major = major;
    }

    public void eat() {
        System.out.println("学生： 吃饭哈哈哈");
    }

    public void study() {
        System.out.println("学生：学习知识");
        this.eat();
        super.eat();
        walk();
    }

    public void show() {
        System.out.println("name = " + name + ", age = " + age);
        System.out.println("id = " + this.id);
        System.out.println("id = " + super.id);
    }
}
