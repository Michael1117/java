package com.hefeng.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * student表 添加一条记录 insert 语句
 * */
public class jdbcDemo3 {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql:///itcast?useSSL=false&serverTimezone=Asia/Shanghai";
        Statement stmt = null;
        Connection conn = null;

        try {
            // 1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2.定义sql
            String sql = "insert into student value(null, 'John', '男',30,'研究生',20000, 8000, '北京')";

            // 3. 获取Connection对象
            //conn = DriverManager.getConnection(DB_URL, "root", "12345678");

            // 4. 获取执行sql的对象 Statement
            //stmt = conn.createStatement();
            // 5. 执行sql
            //int count = stmt.executeUpdate(sql);

            int count = DriverManager.getConnection(DB_URL, "root", "12345678").createStatement().executeUpdate(sql);
            // 6. 处理结果
            System.out.println(count);
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
