package com.shoo.dubbo.service.impl;


import com.shoo.dubbo.pojo.User;
import com.shoo.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;
//import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "${dubbo.service.version}") //声明这是一个dubbo服务
public class UserServiceImpl implements UserService {
    /**
     * 实现查询，这里做模拟实现，不做具体的数据库查询
     */
    public List<User> queryAll() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(10 + i);
            user.setId(Long.valueOf(i + 1));
            user.setPassword("123456");
            user.setUsername("username_" + i);
            list.add(user);
        }
        return list;
    }
}
