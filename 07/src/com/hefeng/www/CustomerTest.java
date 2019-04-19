package com.hefeng.www;

public class CustomerTest {
    public static void main(String args[]) {
        Customer cust1 = new Customer();

        cust1.eat();
    }

}


// 客户类
class Customer {

    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法

    public void eat() {  // 没有返回值
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName() {  // 有返回值
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国籍是：" + nation;

        return info;
    }
}