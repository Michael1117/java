package com.hefeng.www;

import com.hefeng.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务操作
 */
public class JDBCDemo10 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            // 1. 获取连接
            conn = JDBCUtils.getConnection();

            // 开启事务
            conn.setAutoCommit(false);
            // 2. 定义sql
            // 2.1 张三 - 500
            String sql1 = "update account set money = money - ? where id = ?";
            // 2.2 李四 + 500
            String sql2 = "update account set money = money + ? where id = ?";

            // 3. 获取执行sql对象
            pstmt1 = conn.prepareStatement(sql1);

            pstmt2 = conn.prepareStatement(sql2);

            // 4. 设置参数
            pstmt1.setDouble(1, 500);
            pstmt1.setInt(2, 1);


            pstmt2.setDouble(1, 500);
            pstmt2.setInt(2, 2);

            // 5.执行sql

            pstmt1.executeUpdate();
            // 手动制造异常
            //int i = 3 / 0;
            pstmt2.executeUpdate();
            // 添加事务
            conn.commit();  // 全部执行完没有发生异常就提交事务，一旦发生异常则catch
        } catch (Exception e) {
            // 事务的回滚  只要出现异常就回滚，此次操作不执行
            try {
                if (conn != null)
                    conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstmt1, conn);
            JDBCUtils.close(pstmt2, null);
        }
    }
}
