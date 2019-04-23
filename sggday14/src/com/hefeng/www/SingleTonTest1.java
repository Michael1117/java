package com.hefeng.www;

/*
*
* */
public class SingleTonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();

        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}


class Bank{


    // 1. 私有化类的构造器
    private Bank() {
    }
    // 2. 内部创建类的对象
    private static Bank instance = new Bank();

    public static Bank getInstance() {
        return  instance;
    }

}