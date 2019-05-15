package com.shoo.java;


/**
 * 类中方法的声明和使用
 * <p>
 * 方法： 描述类应用具有的功能。
 * 比如： Math类：sqrt()、random()
 * Scanner类： nexXxx()
 * Arrays类： sort()、binarySearch()、toString()、equals()
 * <p>
 * 1. 举例：
 * public void eat(){}
 * public void sleep(int hour){}
 * public String getName(){}
 * public String getNation(){}
 * <p>
 * <p>
 * 2. 方法的声明： 权限修饰符  返回值类型  方法名(形参列表) {
 * 方法体
 * }
 * 注意： static、final、abstract来修饰的方法，之后讲
 * <p>
 * 3. 说明：
 * 3.1 关于权限修饰符： 默认方法的权限修饰符先都使用public
 * Java规定的4种权限修饰符： private、public、缺省、protected
 * <p>
 * 3.2 返回值类型： 有返回值 vs 无返回值
 * 3.2.1 如果方法有返回值，则必须在方法声明时，指定返回值的类型。同时，在方法中，需要使用return关键字来返回指定类型的变量或常量： "return 数据"
 * 如果方法没有返回值，则方法声明时，使用void来表示。通常，没有返回值的方法中，就不需要使用return。但是，如果使用的话，只能"return;"表示结束此方法的意思。
 * 3.3.2  我们定义方法该不该有返回值？
 * ① 要求
 * ② 凭经验：具体问题，具体分析
 * <p>
 * 3.3 方法名： 属性标识符，遵循标识符的规则和规范，"见名知意"
 * <p>
 * 3.4  形参列表： 方法可以声明0个，1个，或多个形参。
 * 3.4.1  格式： 数据类型1  形参1, 数据类型2 形参2, ....
 * <p>
 * 3.5  方法体： 方法功能的体现
 * <p>
 * 4. return关键字的使用：
 * 1. 使用范围： 使用在方法中
 * 2. 作用： ① 结束方法
 * ②  针对于有返回值类型的方法，使用"return 数据" 方法返回所要的数据。
 * 3. 注意点： return关键字后面不可以声明执行语句。
 * <p>
 * 5. 方法的使用中，可以调用当前类的属性或方法
 * 特殊的： 方法A中又调用了方法A: 递归方法
 * 方法中，不可以定义方法。
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();

        cust1.eat();

        cust1.sleep(8);
        String n = cust1.getNation("中国");
        System.out.println(n);
    }
}


// 客户类

class Customer {

    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法

    public void eat() {
        System.out.println("客户吃饭");

        return;
    }

    public void sleep(int hour) {

        System.out.println("休息了" + hour + "个小时");
        eat();
    }

    public String getName() {

        if(age > 18) {
            return name;
        }else {
            return "Tom";
        }
    }

    public String getNation(String nation) {
        String info = "我的国籍是：" + nation;
        return info;
    }

    public void info() {

    }
}