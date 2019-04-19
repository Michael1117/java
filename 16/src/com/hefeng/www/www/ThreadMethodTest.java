package com.hefeng.www.www;

/**
 * 测试Thread中常用的方法：
 * 1.start() :启动当前线程
 * 2. run()
 * 3.currentThread(): 静态方法，返回执行当前代码的线程
 * 4.getName(): 获取当前线程的名字
 * 5.setName(): 设置当前线程的名字
 * 6. yield()
 */

class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

//            if (i % 20 == 0) {
//                this.yield();
//            }


        }
    }

    public HelloThread(String name) {
        super(name);
    }

}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread: 1");
        //h1.setName("线程一");

        h1.start();

        // 给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

}
