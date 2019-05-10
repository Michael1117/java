package com.shoo.java1;


/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
    public static void main(String[] args) {

    }
}


class Bank {
    private Bank() {

    }

    private static Bank instance = null;

    /*public static synchronized Bank getInstance() {
        synchronized (Bank.class) {
            if (instance == null) {
                instance = new Bank();

            }

            return instance;
        }
    }*/

    public static Bank getInstance() {
        // 方式一： 效率稍差
        /*synchronized (Bank.class) {
            if (instance == null) {
                instance = new Bank();

            }

            return instance;
        }*/
        // 方式一： 效率更高
        if (instance == null) {
            synchronized (Bank.class) {
                if(instance == null) {
                    instance = new Bank();
                }
            }
        }

        return instance;
    }
}