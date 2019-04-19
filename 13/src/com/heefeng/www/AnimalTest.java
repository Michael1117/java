package com.heefeng.www;


import java.sql.Connection;

/*
* 多态性的使用举例一：
*
* */
public class AnimalTest {
    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.func(new Dog());

        test.func(new Cat());
    }

    public void func(Animal animal) {  // Animal animal = new Dog()
        animal.eat();
        animal.shout();
    }
}


class Animal{
    public void eat() {
        System.out.println("Animal.eat");
    }

    public void shout() {
        System.out.println("Animal.shout");
    }

}

class Dog extends Animal{
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void shout() {
        System.out.println("狗叫");
    }
}

class Cat extends Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void shout() {
        System.out.println("喵喵喵！");
    }
}


// 举例2：
class Order{
    public void method(Object obj) {

    }
}

// 举例3：

class Driver{
    public void doData(Connection conn) {  // conn = new MySQlConnection

    }
}