package com.shoo.java1;

import com.shoo.java.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.methodPublic();
        order.orderPublic = 444;

        System.out.println(order.orderPublic);

        // 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
    }
}
