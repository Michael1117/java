package com.heefeng2.www;

public class EqualsTest {


    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;

        //System.out.println(i == j);
        //System.out.println(i == d);

        char c = 65;
        //System.out.println('A' == c);

        Customer c1 = new Customer("Tom", 22);
        Customer c2 = new Customer("Tom", 22);

        System.out.println(c1 == c2);

        System.out.println(c1.equals(c2));

        String s1 = new String("cc");
        String s2 = new String("cc");

        System.out.println(s1.equals(s2));




    }
}
