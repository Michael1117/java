package com.shoo.dao;

import com.shoo.domain.User;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface IUserDao {
    List<User> findAll();
}
