package com.shoo.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Keys {
    final double PROJECT_ACCOUNT_ID = 3.14;

    public static void main(String[] args) {
        String s = new String();
        String str = new String("XXhheew");
        char c = str.charAt(0);
        int num = 1;

        ArrayList list123 = new ArrayList();

        list123.add(123);
        list123.add(233);
        list123.add(123);
        list123.add(123);
        list123.add(345);
        list123.add(345);

        System.out.println(list123);
        HashMap map = null;
        map = new HashMap();

        Date date = new Date(3243524L);
        HashMap map1 = null;
    }
}


class User{

    private int id;
    private String name;

    public int getId() {
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}