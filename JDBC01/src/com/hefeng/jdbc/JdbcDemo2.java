package com.hefeng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account 表 添加一条记录 insert 语句
 */
public class JdbcDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///eesy", "root", "12345678");
            stmt = conn.createStatement();
            String sql = "insert into account values(null, 'Bob', 3000)";

            int count = stmt.executeUpdate(sql);

            System.out.println(count);

            if(count > 0) {
                System.out.println("添加成功！！");
            }else {
                System.out.println("添加失败！！！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
