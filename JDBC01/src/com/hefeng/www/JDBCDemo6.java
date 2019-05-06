package com.hefeng.www;

import java.sql.*;

/**
 * 执行DDL语句
 */
public class JdbcDemo6 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///eesy", "root", "12345678");

            // 3. 定义sql语句
            String sql = "select * from account";

            // 4. 获取执行sql对象
            stmt = conn.createStatement();
            // 5. 执行sql

            rs = stmt.executeQuery(sql);

            rs.next();
            int id = rs.getInt(1);
            String name = rs.getString("name");
            double money = rs.getDouble(3);

            System.out.println(id + "----" + name + "----" + money);


            rs.next();
            int id2 = rs.getInt(1);
            String name2 = rs.getString("name");
            double money2 = rs.getDouble(3);
            System.out.println(id2 + "---" + name2 + "---" + money2);

            rs.next();

            int id3 = rs.getInt(1);
            String name3 = rs.getString(2);
            Double money3 = rs.getDouble(3);

            System.out.println(id3+ "---" + name3 + "---" + money3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
