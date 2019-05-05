package com.hefeng.www;

import java.sql.*;

/**
 * DDL语句  没有返回结果
 * */
public class JDBCDemo5 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///eesy", "root", "12345678");

            // 3. 定义sql
            String sql = "select * from account";
            // 4. 获取执行sql对象

            stmt = conn.createStatement();

            // 5. 执行sql
            rs = stmt.executeQuery(sql);

            // 6. 处理结果
            //System.out.println(count);
            // 6.1 让游标向下移动一行
            rs.next();
            // 6.2  获取数据
            int id = rs.getInt(1);
            String name = rs.getString("name");
            double money = rs.getDouble(3);

            System.out.println(id + "----" + name + "----" + money);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 7 .释放资源
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
