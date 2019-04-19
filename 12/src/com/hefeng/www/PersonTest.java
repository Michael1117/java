package com.hefeng.www;


/*
* 1.方法的重写： 子类继承父类后，可以对父类中同名同参数的方法，进行覆盖操作。
* 2. 应用：重写以后，当创建子类对象后，通过子类对象调用子父类同名同参数的方法是，实际执行的是子类重写父类的方法
*
*
* */
public class PersonTest {

    public static void main(String[] args) {
        Student s = new Student("计算机科学与技术");

        s.eat();
        s.walk(10);

        s.study();
    }
}
