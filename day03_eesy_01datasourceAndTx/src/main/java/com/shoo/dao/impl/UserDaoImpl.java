package com.shoo.dao.impl;


import com.shoo.dao.IUserDao;
import com.shoo.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 *
 */
public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory){
        this.factory = factory;
    }

    @Override
    public List<User> findAll() {
        // 1. 根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        // 2. 调用SqlSession中的方法，实现查询列表
        List<User> users = session.selectList("com.shoo.dao.IUserDao.findAll");  // 参数就是能获取配置信息的key

        // 3. 释放资源
        session.close();
        return users;
    }

    @Override
    public void saveUser(User user) {
        // 1. 根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        // 2. 调用SqlSession中的方法，实现查询列表
        session.insert("com.shoo.dao.IUserDao.saveUser", user);
        // 3. 提交事务
        session.commit();
        // 4. 释放资源
        session.close();
    }

    @Override
    public void updateUser(User user) {
        // 1. 根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        // 2. 调用SqlSession中的方法，实现更新操作
        session.update("com.shoo.dao.IUserDao.updateUser", user);
        // 3. 提交事务
        session.commit();
        // 4. 释放资源
        session.close();
    }

    public void deleteUser(Integer userId) {
        // 1. 根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        // 2. 调用SqlSession中的方法，实现更新操作
        session.update("com.shoo.dao.IUserDao.deleteUser", userId);
        // 3. 提交事务
        session.commit();
        // 4. 释放资源
        session.close();
    }

    @Override
    public User findById(Integer userId) {
        // 1. 根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        // 2. 调用SqlSession中的方法，实现查询一个
        User users = session.selectOne("com.shoo.dao.IUserDao.findById", userId);
        // 4. 释放资源
        session.close();
        return users;
    }

    @Override
    public List<User> findByName(String username) {
        // 1. 根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        // 2. 调用SqlSession中的方法，实现查询列表
        List<User> users = session.selectList("com.shoo.dao.IUserDao.findByName", username);
        // 4. 释放资源
        session.close();
        return users;
    }
    @Override
    public int findTotal() {
        // 1. 根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        // 2. 调用SqlSession中的方法，实现查询列表
        Integer count = session.selectOne("com.shoo.dao.IUserDao.findTotal");
        // 4. 释放资源
        session.close();
        return count;
    }
}
