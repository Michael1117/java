package com.shoo.exer;


import java.util.Map;

/**
 *
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2;

        //System.out.println(c1.findArea());
        System.out.println(c1.findArea());
    }
}

class Circle {
    // 属性
    double radius;

   /* public double findArea() {

        double area = Math.PI * radius * radius;
        return area;
    }*/

    /*public void findArea() {
        double area = Math.PI * radius * radius;
        System.out.println("面积为：" + area);
    }*/

    public double findArea() {
        double area = 3.14 * radius * radius;
        return area;
    }
}
