package com.shoo.java;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 111;
        order.orderDefault = 222;

        System.out.println(order.orderDefault);
        System.out.println(order.orderPublic);

        order.methodDefault();
        order.methodPublic();
        //order.methodPrivate();
    }
}
