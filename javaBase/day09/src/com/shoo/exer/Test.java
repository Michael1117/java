package com.shoo.exer;

import java.io.PrintStream;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        method(a, b);

        System.out.println("a=" + a);   // 要求a输出100，b输出200
        System.out.println("b=" + b);
    }


    /*public static void method(int a, int b) {
        a = a * 10;
        b = b * 20;

        System.out.println(a);
        System.out.println(b);
        System.exit(0);
    }*/

    // 方法二
    public static void method(int a, int b) {

        PrintStream ps = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                if ("a=10".equals(x)) {
                    x = "a=100";
                } else if ("b=10".equals(x)) {
                    x = "b=200";
                }
                super.println(x);
            }
        };

        System.setOut(ps);
    }
}


