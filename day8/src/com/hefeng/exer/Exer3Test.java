package com.hefeng.exer;


/*
 * 3.1 编写程序，声明一个method方法，在方法中打印一个10 * 8的*型矩形，在main方法中调用该方法
 *
 * */
public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();

        int area = test.method(10, 12);

        System.out.println("面积为：" + area);
        //System.out.println(test.method());
    }

//    public void method() {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    /*public int method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }*/
    public int method(int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
