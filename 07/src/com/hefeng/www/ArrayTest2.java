package com.hefeng.www;

public class ArrayTest2 {
    public static void main(String args[]) {


        //String[] arr = new String[]{"Jack","Rose","John","Smith","mike","Nicholas","Greg"};

        // 数组的复制 (区别于数组变量的赋值)

        // 二分查找
        int[] arr2 = new int[]{-98, -34, 2, 34, 54, 56, 66, 78, 107, 210, 333};

        int dest1 = -4;
        int head = 0;  // 初始的索引
        int end = arr2.length - 1;

        boolean isFlag1 = true;
        while (head <= end) {

            int middle = (head + end) / 2;

            if (dest1 == arr2[middle]) {
                System.out.println("找到了指定位置的元素，位置为：" + middle);
                isFlag1 = false;
                break;
            } else if (arr2[middle] > dest1) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }

        }

        if (isFlag1) {
            System.out.println("很遗憾没有找到");
        }

    }

}
