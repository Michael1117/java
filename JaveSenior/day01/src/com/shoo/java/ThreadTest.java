package com.shoo.java;


/**
 * 多线程的创建，方式一： 继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类对象
 * 4. 通过此对象调用start()
 * 例子： 遍历100以内的所有的偶数
 */
//  1. 创建一个继承于Thread类的子类
class MyThread extends Thread {
    // 2. 重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i );
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        // 3. 创建Thread类的子类对象
        MyThread t1 = new MyThread();
        // 4. 通过此对象调用start() : ① 启动当前线程 ②调用当前线程的run()
        t1.start();
        // 问题一： 不能通过对象直接调用run()的方式启动线程
        //t1.run(); //是错误的，只会执行主线程

        // 问题二：再启动一个新的线程，遍历100以内的偶数。不能直接t1.start()。会报错java.lang.IllegalThreadStateException
        //  t1.start();  错误的

        // 需要重新创建一个线程的对象
        MyThread t2 = new MyThread();
        t2.start();

        // 以下操作仍然在main中执行
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "*****");
            }
        }
    }
}
