package com.shoo.java;

import org.junit.Test;

/**
 * 异常的处理：抓抛模型
 *
 * 过程一： "抛": 程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象
 *               并将此对象抛出。一旦抛出对象以后，其后的代码就不再执行。
 *
 * 过程二： "抓"： 可以理解为异常的处理方式： ①try-catch-finally  ②throws
 * try-catch-finally的使用
 *
 * try{
 *      // 可能出现的代码
 * }catch(异常类型1 变量名1){
 *      // 处理异常的方式
 * }catch (异常类型2 变量名2) {
 *      // 处理异常的方式
 * }catch (异常类型3 变量名3) {
 *      // 处理异常的方式
 * }
 * catch (异常类型4 变量名4) {
 *      // 处理异常的方式
 * }finally{
 *     // 一定会执行的代码
 * }
 *
 * 说明：
 * 1. finally是可选的
 * 2.
 *
 */
public class ExceptionTest1 {
    @Test
    public void test1() {
        String str = "123";

        str = "abc";
        try {
            int num = Integer.parseInt(str);

            System.out.println("hello---1");
        }catch (NumberFormatException e) {
            System.out.println("出现数值转换异常了，不要着急...");
        }

        System.out.println("hello---2");
    }

}
