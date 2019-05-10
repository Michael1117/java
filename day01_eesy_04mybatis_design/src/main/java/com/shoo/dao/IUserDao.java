package com.shoo.dao;

import com.shoo.domain.User;
import com.shoo.mybatis.annotation.Select;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface IUserDao {
    @Select("select * from ")
    List<User> findAll();
}
