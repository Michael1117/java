package com.shoo.java;

import org.junit.Test;

/**
 * try-catch-finally中finally的使用
 * 1.  finally是可选的
 * 2.
 */
public class FinallyTest {

    @Test
    public void testMethod() {
        int num = method();
        System.out.println(num);
    }

    public int method() {
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("一定会被执行");
        }
    }

    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            //int[] arr = new int[10];
            //System.out.println(arr[10]);  // 因为没有try-catch，所以报错，程序直接跳出方法
            //e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println("哈哈哈哈");

        finally {
            System.out.println("哈哈哈~~");
        }
    }
}
