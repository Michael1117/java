package com.shoo.java;


/**
 * 自定义数组的工具类
 */
public class ArrayUtil {
    // 求数组的最大值

    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 求数组最小的值

    public int getMin(int[] arr) {
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        return minValue;
    }

    // 求数组的总和
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 求数组的平均值
    public int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    // 数组的反转

    public void reverse(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
        }
    }

    // 复制数组
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        return arr1;
    }

    // 数组排序
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {

                    swap(arr, j, j + 1);
                }
            }
        }
    }

    //
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();;
    }

    public int getIndex(int[] arr, int dest) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dest) {
                return i;
            }
        }

        return -1;
    }
}
