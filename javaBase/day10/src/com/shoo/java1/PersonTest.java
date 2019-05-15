package com.shoo.java1;

/**
 * 类的结构三： 构造器(或构造方法、constructor)的使用
 * construct: 建设、建造。
 *
 * 一、构造器的作用：
 * 1.创建对象
 * 2.初始化对象的信息
 *
 * 二、说明
 * 1.如果没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式 ： 权限修饰符 类名(形参列表) {}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显示的定义了类的构造器之后，系统就不再提供默认的空参构造器
 * 5.一个类中，至少会有一个构造器
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        //Person p = new Person("Tom");
        p.eat();
        System.out.println(p.name);
        System.out.println(p.age);

        /*Person p1 = new Person("Tom");
        System.out.println(p1.name);

        Person p2 = new Person("Tom", 13);
        System.out.println(p1.age);*/
    }
}


class Person {

    // 属性
    String name;
    int age;

    // 构造器
    public Person() {
        System.out.println("Person().....");
    }

    public Person(String n) {
        name = n;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    // 方法

    public void eat() {
        System.out.println("人吃饭");
    }

    public void study() {
        System.out.println("人学习");
    }
}