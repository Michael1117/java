package com.hefeng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {
    public static void main(String[] args) {
        // 1. 导入驱动jar包
        Connection conn = null;
        Statement stmt = null;
        // 2. 注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 3 . 获取数据库连接对象

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy", "root", "12345678");

            // 4. 定义sql语句
            String sql = "update account set money = 2600 where id = 1";

            // 5. 获取执行sql的对象 Statement
            stmt = conn.createStatement();

            // 6. 执行sql语句
            int count = stmt.executeUpdate(sql);

            // 7. 处理结果

            // 8. 释放资源你
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
