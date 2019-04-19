package com.heefeng4.www;

public class Man extends Person {

    boolean isSmoking;
    int id = 1002;

    public void earnMoney() {
        System.out.println("Man.earnMoney");
    }

    public void eat() {
        System.out.println("男人： 吃饭");
    }

    public void walk() {
        System.out.println("男人： 走路");
    }
}
