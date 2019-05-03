package com.hefeng.www;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {


    @Test
    public void test1() {
        // 1.创建Person类的对象
        Person p1 = new Person("Tom", 12);

        // 2.通过对象，调用其内部的属性，方法
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        // 在Person类外部， 不可以通过Person类的对象调用其内部私有结构

    }

    // 反射之后，对于Person的操作
    @Test
    public void test2() throws Exception {
        Class clazz = Person.class;

        // 1. 通过反射，创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class, int.class);

        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(obj.toString());

        // 2. 通过反射，调用对象指定的属性，方法
        // 调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p, 10);

        System.out.println(p.toString());

        // 调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);
        System.out.println("==================");

        // 通过反射，可以调用Person类的私有结构。比如： 私有的构造器，方法，属性

        Constructor cons1 = clazz.getDeclaredConstructor(String.class);

        cons1.setAccessible(true);
        Person p1 = (Person)cons1.newInstance("Jerry");
        System.out.println(p1);

        // 调用私有的属性
        Field name =  clazz.getDeclaredField("name");

        name.setAccessible(true);
        name.set(p1, "HanMeiMei");

        System.out.println(p1);

        // 调用私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);

        String nation = (String) showNation.invoke(p1, "中国"); // 相当于p1.showNation("中国")

        System.out.println(nation);
    }
}
