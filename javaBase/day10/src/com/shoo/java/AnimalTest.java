package com.shoo.java;

/**
 * 面向对象的特征之一： 封装与隐藏
 * <p>
 * 一、问题的引入：
 * 当我们创建一个类的对象以后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值。赋值操作要受到属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。
 * <p>
 * 4种权限都可以用来修饰类的内部结构： 属性、方法、构造器、内部类
 * 修饰类的话，只能使用： 缺省、public
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.setAge(4);

        System.out.println(a.name);
        System.out.println(a.getAge());

        a.setLegs(4);

        a.show();
    }
}

class Animal {
    String name;
    private int age;
    private int legs;   // 腿的个数

    // 对属性设置
    public void setLegs(int l) {
        if (l > 0 && l % 2 == 0) {
            legs = l;
        }else {
            legs = 0;
        }
    }

    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("动物吃");
    }

    public void show() {
        System.out.println("name = " + name + "，age=" + age + "，legs=" + legs);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
       age = a;
    }
}
