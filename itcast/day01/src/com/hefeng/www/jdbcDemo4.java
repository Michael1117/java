package com.hefeng.www;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * student 表修改记录
 * */
public class jdbcDemo4 {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql:///itcast?useSSL=false&serverTimezone=Asia/Shanghai";
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, "root", "12345678");

            stmt = conn.createStatement();

            String sql = "UPDATE student SET salary=6500 WHERE id=1";
            int count = stmt.executeUpdate(sql);

            System.out.println(count);
            if (count > 0) {
                System.out.println("修改成功！");
            } else {
                System.out.println("修改失败！");
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
