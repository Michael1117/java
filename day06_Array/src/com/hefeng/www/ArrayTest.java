package com.hefeng.www;


/**
 * 一、数组的概述
 *  1.数组的理解： 数组(Array), 是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，
 *  并通过编号的方式对这些数据进行统一管理。
 *  2. 数组相关的概念：
 *     > 数组名
 *     > 元素
 *     > 角标、下标、索引
 *     > 数组的长度： 元素的个数
 *
 */
public class ArrayTest {
    public static void main(String[] args) {
        // 1. 一维数组的声明和初始化
        int num; // 声明
        num = 10; // 初始化
        int id = 1001; // 声明 + 初始化

        int[] ids;  // 声明
        // 1.1 静态初始化化： 数组的静态初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001,1002,1003,1004};
        // 1.2 动态初始化： 数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];

        // 也是正确的写法
        int[] arr4 = {1,2,3,4,5};  // 类型推断

        // 总结： 数组一旦初始化完成，其长度就确定了
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "Rose";
        names[4] = "Jack";

        // 3 . 获取数组的长度
        System.out.println(names.length);

        int[] ids2 = new int[5];
        System.out.println(ids2.length);
        String[] pass = new String[]{"1","2","2","3","3","3"};
        System.out.println(pass.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
