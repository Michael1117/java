package com.heefeng2.www;

public class Customer {
   /* public static void main(String[] args) {

    }*/

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer() {
        super();
    }

    public Customer(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // 重写的原则： 比较两个对象的实体内容（即：name 和 age） 是否相同
    /*@Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if (this == obj) {
            return true;
        }

        if (obj instanceof Customer) {
            Customer cust = (Customer) obj;
            // 比较两个对象的每个属性是否都相同
            *//*if (this.age == cust.age && this.name.equals(cust.name)) {
                return true;
            }else {
                return  false;
            }*//*
            return this.age == cust.age && this.name.equals(cust.name);
        }else {
            return false;
        }
        }
*/
        //return false;



}
