package com.shoo.exer;

/**
 * 银行有一个账户。
 * 有两个储户向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 *
 * 分析： 多线程不一定会导致线程安全问题，有共享数据才会导致线程安全问题。
 * 1.是否是多线程的问题？ 是，两个储户线程
 * 2.是否有共享数据？有，账户（或账户余额）
 * 3.是否有线程安全问题？ 有
 * 4. 考虑如何解决线程安全问题？ 同步机制： 有三种方式
 *
 * 继承的方式解决同步安全问题，慎用this，本例中由于new 的是同一个Account对象，所以是同一个this。
 * 多个线程一定要保证用的是同一个this。这样才能保证线程安全问题。
 */
class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    // 存钱
    public synchronized void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "存钱成功。余额为：" + balance);
        }
    }
}

class Customer extends Thread {

    private Account acct;

    public Customer(Account acct) {
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}
