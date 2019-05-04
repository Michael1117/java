package com.hefeng.service.impl;

import com.hefeng.service.IAccountService;

import java.util.Date;

public class AccountServiceImpl2 implements IAccountService {


    //  如果是经常变化的数据，并不适用于注入的方式
    private String name;
    private Integer age;
    private Date birthday;

    // 注入只需要set 方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {

        System.out.println("service中的saveAccount方法执行了" + name + " ,  " + age + "," + birthday );

    }
}
