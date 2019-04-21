package com.hefeng.dao;


import com.hefeng.domain.User;
import com.hefeng.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/*
 * 操作数据库中的User表的类
 * */
public class UserDao {

    // 声明JDBCTemplate对象共用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 登录方法
     *
     * @param loginUser 只有用户名和密码
     * @return user包含用户全部数据, 没有查询到，返回一个null
     */
    public User login(User loginUser) {
        // 编写sql
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "SELECT * FROM user WHERE username=? and password = ?";

            // 调用query方法
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class), loginUser.getUsername(), loginUser.getPassword());

            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();  // 记录日志
            return null;
        }
    }
}
