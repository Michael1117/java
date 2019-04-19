package com.hefeng.www.www;

public class Person extends Creature{
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Person.eat");
    }

    public void sleep() {
        System.out.println("Person.sleep");
    }

}
