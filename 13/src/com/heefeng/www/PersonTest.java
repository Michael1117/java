package com.heefeng.www;


/*
* 面向对象特征之三： 多态性
* 理解多态性： 可以理解为一个事物的多种形态
*
* 编译的是父类，执行的是子类，子类对父类的方法进行了重写。
*
* */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        //p1.eat();

        Man man = new Man();

        //man.eat();
        man.age = 25;
        //man.earnMoney();

        // 对象的多态性  父类的引用指向子类的对象

        Person p2 = new Man();
        Person p3 = new Woman();

        p2.eat();
        p3.eat();

        // 报错 ，因为Person 中没有earnMoney() 方法，p2.earnMoney()编译出错，编译看左边，执行看右边。
        // p2.earnMoney();

        //System.out.println(p2.id);  // 调用的是Person中的id,编译和运行都看左边

        // p2.earnMoney();

        // 如何才能调用子类特有的属性和方法？
        // 向下转型：使用强制类型转换
        Man m1 = (Man)p2;
        m1.earnMoney();
        m1.isSmoking = true;

        //Woman w1 = (Woman)p2;  // 有可能出现类型转换异常  ClassCastException instanceof
        //w1.goShopping();

        if(p3 instanceof Woman) {
            Woman w1 = (Woman)p3;
            w1.goShopping();
            System.out.println("-----------");
        }
    }
}
