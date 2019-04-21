package com.hefeng.test;

import com.hefeng.dao.UserDao;
import com.hefeng.domain.User;
import org.junit.Test;

public class UserDaoTest {


    @Test
    public void testLogin() {
        User loginuser = new User();
        loginuser.setUsername("张三");
        loginuser.setPassword("12344");

        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
