package com.hefeng.www;

public class StaticTest {
    public static void main(String[] args) {

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;
    }
}

class Chinese{
    String name;
    int age;
}