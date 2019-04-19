package com.hefeng.www;

public class Array {

    public static void main(String args[]) {
        int[] array1, array2;

        array1 = new int[]{2, 3, 33, 11, 4, 5, 6, 66, 8, 1, 22};

        for (int i = 0; i < array1.length; i++) {
            int i1 = array1[i];
            System.out.println(i1 + "\t");
        }

        // 赋值array2变量等于array1

        array2 = array1;

        // 修改array2中的偶索引元素，使其等于索引值

        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }

        }

        System.out.println("-----------------------");
        //
        for (int i = 0; i < array1.length; i++) {
            int i1 = array1[i];
            System.out.println(i1 + "\t");
        }
    }
}
