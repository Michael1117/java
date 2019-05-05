package com.hefeng.datasource.jdbctemplate;

import com.hefeng.datasource.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * jdbcTemplate入门
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        // 1. 导入jar包

        // 2. 创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        // 3. 调用方法
        String sql = "update account set money = 5000 where id = ?";
        int count = template.update(sql, 5);

        System.out.println(count);


    }
}
