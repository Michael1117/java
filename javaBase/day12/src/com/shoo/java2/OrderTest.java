package com.shoo.java2;

/**
 * 4种不同的权限修饰符
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 111;
        order.orderProtected = 2222;
        order.orderPublic = 33333;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        // 同一个包中的其他类，不可以调用Order类中所有的属性，方法
    }
}

