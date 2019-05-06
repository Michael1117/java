package com.hefeng.Jdbctemplate;

import com.hefeng.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        // 1.导入jar包
        // 2. 创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "update account set money = 6000 where id=?";

        template.update(sql, 10);
    }
}
