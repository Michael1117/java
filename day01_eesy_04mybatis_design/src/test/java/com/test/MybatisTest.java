package com.test;

import com.shoo.mybatis.io.Resources;
import com.shoo.mybatis.sqlsession.SqlSession;

import com.shoo.mybatis.sqlsession.SqlSessionFactory;
import com.shoo.mybatis.sqlsession.SqlSessionFactoryBuilder;
import com.shoo.dao.IUserDao;
import com.shoo.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * mybatis的入门案例
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        // 1. 读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2. 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //SqlSessionFactory factory = builder.build(in);
        SqlSessionFactory factory = builder.build(in);

        // 3. 使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        // 4. 使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        // 5. 使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        // 6. 释放资源
        session.close();
        in.close();
    }
}
