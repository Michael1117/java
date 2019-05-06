package com.hefeng.www;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account表删除一条记录
 */
public class JdbcDemo4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // 1. 导入jar包

            // 2. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 3. 获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///eesy", "root", "12345678");

            // 4. 定义sql语句
            String sql = "delete from account where id = 5";

            // 5. 获取执行sql对象 Statement
            stmt = conn.createStatement();

            int count = stmt.executeUpdate(sql);
            System.out.println(count);

            if(count > 0) {
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
