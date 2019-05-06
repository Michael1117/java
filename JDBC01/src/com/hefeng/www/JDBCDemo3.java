package com.hefeng.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // 1. 导入驱动jar包
            // 2.  注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 3. 获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///eesy", "root", "12345678");

            // 4. 定义sql语句
            String sql = "update account set money=3500 where id=5";
            // 5. 获取执行sql对象 Statement
            stmt = conn.createStatement();

            // 6. 执行sql
            int count = stmt.executeUpdate(sql);
            // 7. 处理结果
            System.out.println(count);

            if (count > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
