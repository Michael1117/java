package com.hefeng.www;

public class Person {

    String name;
    int age;
    int id = 1001;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void eat() {

        System.out.println("吃饭");
    }

    public void walk(int distance) {

        System.out.println("走了" + distance + "公里");
    }
}
