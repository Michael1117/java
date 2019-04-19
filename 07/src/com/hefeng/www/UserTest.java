package com.hefeng.www;

public class UserTest {
    public static void main(String args[]) {
        User u1 = new User();

        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);

        u1.talk("English");
    }
}


class User {
    // 属性 (或者叫成员变量)
    public String name;
    int age;
    boolean isMale;

    public void talk(String language) {  // language 形参
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat() {
        String food = "披萨";

        System.out.println("北方人喜欢吃" + food );
    }
}