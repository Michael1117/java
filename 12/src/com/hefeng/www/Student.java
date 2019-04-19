package com.hefeng.www;

public class Student extends Person {
    String major;

    int id = 1002;

    public Student() {

    }

    public Student(String major) {

        this.major = major;
    }

    public Student(String name, int age, String major) {

        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("Student.eat");
    }

    public void study() {

        System.out.println("学习。专业是：" + major);
        eat();
        super.eat();
    }

    public void show() {
        System.out.println("name = " + name + ",age = " + age);
        System.out.println("id = " + id);
        System.out.println("id = " + super.id);
    }

}
