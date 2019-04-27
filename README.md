# day 8

package com.hefeng.www;

 一、Java面向对象：
 1. Java类及类的成员： 属性、方法、构造器；代码块、内部类
 2. 面向对象的三大特征：封装、继承、多态、（抽象性）
 3. 其他关键字： this,super,static,final,abstract,interface,package,import

 二、"人把大象装进冰箱"
 1. 面向过程： 强调的是功能行为，以函数为最小单位，考虑怎么做。
      ① 把冰箱门打开
      ② 抬起大象，塞进冰箱
      ③ 把冰箱门关闭
 2. 面向对象： 强调具备了功能的对象，以类/对象为最小单位，考虑谁来做

     人{
           打开(冰箱){
               冰箱.开开()
           }
           抬起(大象){
               大象.进入(冰箱)
           }
           关闭(冰箱){
               冰箱.闭合()
           }
     }
     
     冰箱{
           开开(){}
           闭合(){}
      }
     
     大象{
           进入(冰箱){}
     }

 三、面向对象的两个要素：
 类： 对一类事物的描述，是抽象的，概念上的定义
 对象： 是实际存在的该类事物的每个个体，因而也称为实例(instance)

 > 面向对象程序设计的重点是类的设计
 >设计类就是设计类的成员

 

```java
public class OOPTest {
    
}
```

## 2.2

```java
package com.hefeng.www;

/*
 * 类中属性的使用
 *
 * 属性(成员变量) vs 局部变量
 * 1.相同点：
 *   1.1 定义变量的格式： 数据类型 变量名 = 变量值
 *   1.2 先声明，后使用
 *   1.3 变量都有其对应的作用域
 *
 * 2. 不同点：
 *   2.1 在类中声明的位置的不同
 *   属性： 直接定义在类的一对{}内
 *   局部变量： 声明在方法内，方法形参，代码块内，构造器形参，构造器内部的变量
 *
 *   2.2 关于权限修饰符的不同
 *   属性： 可以在声明属性时，指明其权限，使用权限修饰符
 *        常用的权限修饰符： private,public,缺省，protected ---> 封装性
 *        目前，声明属性时，都使用缺省
 *
 *   局部变量： 不可以使用权限修饰符
 *   2.3 默认初始化值得情况
 *
 *       属性： 类的属性，根据其类型，都有默认初始化值。
 *           整型 （byte,short,int,long） : 0
 *           浮点型 (float,double) : 0.0
 *           字符型 (char): 0 (或'\u0000')
 *           布尔型 (boolean) : false
 *
 *       引用数据类型(类，数组，接口) ： null
 *       局部变量： 没有默认初始化值。
 *           意味着，我们在调用局部变量之前，一定要显示赋值
 *           特别地： 形参在调用时，我们赋值即可
 *   2.4 在内存中加载的位置：
 *           属性： 加载到堆空间中 (非static)
 *           局部变量： 加载到栈空间
 *
 * */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);

        System.out.println(u1.isMale);

        u1.talk("汉语");
        u1.eat();
    }
}


class User {
    // 属性 (或成员变量)
    String name;
    public int age;
    boolean isMale;

    public void talk(String language) { // language: 形参，也是局部变量
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat() {
        String food = "披萨"; // 局部变量
        System.out.println("北方人喜欢吃" + food);
    }
}

```

## 内存解析

**方法区(method Area)**：用于存储已被虚拟机加载的**类信息、常量、静态变量、即时编译器编译后的代码**等数据。

**虚拟机栈(VM Stack)**：用于存储**局部变量**等。局部变量表存放了编译器可知长度的各种基本数据类型（boolean,byte,char,short,int,float,long,double）,对象引用（reference类型，它不等同于对象本身，是对象在堆内存的首地址）。方法执行完，自动释放

**本地方法栈(Native Method Stack)**

**堆(Heap):** 存放实例对象即(new XXX() ), 所有的对象实例以及数组都要在堆上分配。

**程序计数器(Program Couter Register)**

![1556096960359](C:\Users\michaelhee\AppData\Roaming\Typora\typora-user-images\1556096960359.png)

## 2.3

```java
package com.hefeng.www;


/*
* 一、设计类，其实就是设计类的成员
*   属性 = 成员变量 = field = 域、字段
*   方法 = 成员方法 = 函数 = method
* 创建类的对象 = 类的实例化 = 实例化类
*
* 二、类和对象的使用 (面向对象)
*   1.创建类，设计类的成员
*   2.创建类的对象
*   3.通过"对象.属性"或"对象.方法"调用对象的结构
* 三、如果创建了一个类的多个对象，则每个对象都独立拥有一套类的属性 (非static的)
*  即： 如果我们修改一个对象的属性a,不会影响另外一个对象属性a的值
* 四、对象的内存解析
*
* */

// 测试类
public class PersonTest {
    public static void main(String[] args) {
        // 2. 创建 Person类的对象
        Person p1 = new Person();

        // 调用对象的结构： 属性,方法
        p1.name = "Tom";
        p1.isMale = true;

        System.out.println(p1.name);

        // 调用方法："对象.方法"
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        System.out.println("-----------------");

        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.isMale);

        // 将p1变量保存的对象地址值赋给p3,导致p1和p3指向了堆空间中的同一个对象实体

        System.out.println("------------");
        Person p3 = p1;

        System.out.println(p3.name);

        p3.age = 10;

        System.out.println(p1.age);
    }
}


// 1.创建类，设计类的成员
class Person {

    // 属性
    String name;
    int age = 1;
    boolean isMale;

    // 方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public void talk(String language) {
        System.out.println("人说话，使用的是" + language);
    }
}
```

