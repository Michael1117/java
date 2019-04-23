package com.hefeng.www;

public class singleTonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
    }
}

class Order {

    private Order() {

    }

    private static Order instance = null;

    // 3.

    public static Order getInstance() {

        if(instance == null) {
            instance = new Order();
        }
        //instance = new Order();
        return instance;
    }
}
