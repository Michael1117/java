package com.shoo.test;

import com.shoo.dao.IUserDao;
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
        //System.out.println(in);
        // 2. 获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 3. 获取SqlSession对象
        sqlSession = factory.openSession();
        // 4. 获取dao的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);
    }

    @After // 用于在测试方法执行之后执行
    public void destroy() throws IOException {

        // 提交事务
        sqlSession.commit();
        // 6.释放资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void testFindAll() throws Exception {
       /* // 1. 读取配置文件，生成输入直接流
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //System.out.println(in);
        // 2. 获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 3. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 4. 获取dao的代理对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        // 5. 执行查询所有的方法*/
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

        // 6. 释放资源
        sqlSession.close();
        in.close();
    }

    /**
     * 测试保存操作
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("mybatis saveuser");
        user.setAddress("广东省深圳市");
        user.setSex("男");
        user.setBirthday(new Date());


      /*  // 1. 读取配置文件，生成输入直接流
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //System.out.println(in);
        // 2. 获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 3. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 4. 获取dao的代理对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        // 5. 执行查询所有的方法
        userDao.saveUser(user);
        // 6. 释放资源
        sqlSession.close();
        in.close();*/
        // 5. 执行保存方法
        userDao.saveUser(user);

    }


    /**
     * 测试更新操作
     */
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(49);
        user.setUsername("mybatis updateuser");
        user.setAddress("广东省深圳市");
        user.setSex("女");
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
        userDao.deleteUser(50);
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
        //List<User> users = userDao.findByName("%王%");
        List<User> users = userDao.findByName("王");

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
}
