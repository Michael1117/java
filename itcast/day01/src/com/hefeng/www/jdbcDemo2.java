package com.hefeng.www;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo2 {
    public static void main(String[] args) throws Exception{
        String DB_URL = "jdbc:mysql://localhost:3306/itcast?useSSL=false&serverTimezone=Asia/Shanghai";
        // 1. 导入驱动jar包
        // 2. 注册驱动

        // 3. 获取数据库连接对象
        Connection conn = DriverManager.getConnection(DB_URL, "root", "12345678");

        String sql = "update student set salary=5500 where id = 1";

        // 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();

        // 6.执行sql
        int count = stmt.executeUpdate(sql);

        // 7.处理结果
        System.out.println(count);
        // 8. 释放资源
        stmt.close();
        conn.close();


    }
}
