package com.shoo.java;

/**
 * 类中属性的使用
 * <p>
 * 属性 (成员变量)  vs  局部变量
 * <p>
 * 1. 相同点
 * 1.1 定义变量的格式： 数据类型  变量名 = 变量值
 * 1.2 先声明，后使用
 * 1.3 变量都有其对应的作用域
 * <p>
 * 2. 不同点
 * 2.1 在类中声明的位置不同
 * 属性： 直接定义在类的一对{}内
 * 局部变量： 声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 * <p>
 * 2.2 关于权限修饰符的不同
 * 属性： 可以在声明属性时，指明其权限，使用权限修饰符。
 * 常用的权限修饰符： private、public、缺省、protected ---> 封装性
 * 局部变量： 不可以使用权限修饰符
 * <p>
 * 2.3 默认初始化值的情况：
 * 属性： 类的属性，根据其类型，都有默认初始化值。
 * 整型(byte、short、int、long)：0
 * 浮点型(float、double)： 0.0
 * 字符型(char): 0  (或'\u0000')
 * 布尔型(boolean): false
 * <p>
 * 引用数据类型(类、接口、数组):null
 * <p>
 * 局部变量： 没有默认初始化值。
 * 在调用局部变量之前，一定要显式赋值
 * 特别地： 形参在调用时，我们赋值即可
 * 2.4 在内存中加载的位置：
 * 属性： 加载到堆空间中  (非static)
 * 局部变量： 加载到栈空间中
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();

        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);

        u1.talk("韩语");
        u1.eat();
    }
}


class User {
    // 属性 (或成员变量)

    String name;
    public int age;
    boolean isMale;

    public void talk(String language) {  // language : 形参，也是局部变量
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat() {

        String food = "烙饼";

        System.out.println("北方人喜欢吃" + food);
    }
}