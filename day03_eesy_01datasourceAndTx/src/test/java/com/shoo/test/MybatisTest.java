package com.shoo.test;

import com.shoo.dao.IUserDao;
import com.shoo.dao.impl.UserDaoImpl;
import com.shoo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * 测试mybatis的crud操作
 */
public class MybatisTest {
    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before // 用于在测试方法执行之前执行
    public void init() throws Exception{
        // 1. 读取配置文件，生成输入直接流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2. 获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 3. 使用工厂对象，创建dao对象
        userDao = new UserDaoImpl(factory);
    }

    @After // 用于在测试方法执行之后执行
    public void destroy() throws IOException {
        in.close();
    }

    @Test
    public void testFindAll() throws Exception {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试保存操作
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("modify User Property");
        user.setAddress("广东省深圳市");
        user.setSex("男");
        user.setBirthday(new Date());

        System.out.println("保存操作之前：" + user);
        // 5.执行保存方法
        userDao.saveUser(user);

        System.out.println("保存方法之后：" + user);


    }


    /**
     * 测试更新操作
     */
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(49);
        user.setUsername("mybatis update user");
        user.setAddress("广东省深圳市xx");
        user.setSex("男");
        user.setBirthday(new Date());

        // 5. 执行保存方法
        userDao.updateUser(user);
    }

    /**
     * 测试删除操作
     */
    @Test
    public void testDelete() {
        // 5. 执行保存方法
        userDao.deleteUser(54);
    }

    /**
     * 测试查询操作
     */
    @Test
    public void testFindOne() {
        // 5. 执行查询一个方法
        User user = userDao.findById(49);
        System.out.println(user);
    }

    /**
     * 根据name模糊查询
     */
    @Test
    public void testFindByName() {
        // 5. 执行查询一个方法
        List<User> users = userDao.findByName("%王%");
        //List<User> users = userDao.findByName("王");

        for (User user: users) {
            System.out.println(user);
        }
    }

    /**
     * 查询总记录条数
     */
    @Test
    public void testFindTotal() {
        // 5. 执行查询一个方法
        int count = userDao.findTotal();
        System.out.println(count);
    }

    /**
     * 测试使用QueryVo作为查询条件
     *//*
    @Test
    public void testFindByVo() {
        QueryVo vo = new QueryVo();

        User user = new User();
        user.setUserName("%王%");
        vo.setUser(user);

        // 5. 执行查询方法
        List<User> users = userDao.findUserByVo(vo);

        for (User u: users){
            System.out.println(u);
        }
    }*/
}
