package com.shoo.exer2;


public class Boy {
    private String name;
    private int age;

    public Boy() {

    }

    public Boy(String name) {
        this.name = name;
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶：" + girl.getName());
    }

    public void shout() {
        if(this.age >= 22) {
            System.out.println(this.getName() + "，可以结婚");
        }else {
            System.out.println(this.getName() + "，不可以结婚");
        }
    }
}
