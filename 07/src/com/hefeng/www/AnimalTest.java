package com.hefeng.www;

public class AnimalTest {
    public static void main(String args[]) {

        Animal a = new Animal();

        a.name = "大黄";
        a.age = 1;
        a.legs = 4;

        a.show();
    }

}


class Animal {

    String name;
    int age;
    int legs;

    public void eat() {
        System.out.println("动物进食");
    }

    public void show() {
        System.out.println("name = " + name + ", age = " + age + " , legs = " + legs);
    }
}
