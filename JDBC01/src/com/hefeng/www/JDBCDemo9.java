package com.hefeng.www;

import com.hefeng.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 需求：
 * 1. 通过键盘录入用户名和密码
 * 2. 判断用户是否登录成功
 */
public class JdbcDemo9 {
    public static void main(String[] args) {
        // 1.键盘录入，接受用户名和密码
        /*Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String username = sc.nextLine();

        System.out.println("请输入密码：");
        String password = sc.nextLine();

        // 2. 调用方法
        boolean flag = new JdbcDemo9().login(username, password);
        if (flag) {
            System.out.println("登录成功！");

        } else {
            System.out.println("用户名或密码错误");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();


        System.out.println("请输入密码：");
        String password = sc.nextLine();

        boolean flag = new JdbcDemo9().login2(username, password);

        if(flag) {
            System.out.println("登录成功！！");
        }else {
            System.out.println("登录失败！！！");
        }
    }

    /**
     * 登录方法
     */

    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        // 连接数据库判断是否登录成功
        try {
            conn = JDBCUtils.getConnection();
            // 2. 定义sql
            String sql = "select * from user where username= '" + username + "' and password = '" + password + "'";
            System.out.println(sql);
            // 3. 获取执行sql对象
            stmt = conn.createStatement();

            // 4. 执行查询
            rs = stmt.executeQuery(sql);

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stmt, conn);
        }

        return false;
    }

    /**
     * 登录方法， 使用PreparedStatement实现
     */

    public boolean login2(String username, String password) {
        if (username == null || password == null)
            return false;

        // 连接数据库判断是否登录成功
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?";

            pstmt = conn.prepareStatement(sql);

            // 给? 赋值
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            // 4. 执行sql, 不需要传递sql
            rs = pstmt.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pstmt, conn);
        }

        return false;
    }
}
