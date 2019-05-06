package com.hefeng.datasource.druid;

import com.hefeng.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DruidDemo2 {
    public static void main(String[] args) {
        /**
         * 完成添加操作： 给account表添加一条记录
         *
         */
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into account values(null, ? , ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Jack");
            pstmt.setDouble(2, 80000);

            int count = pstmt.executeUpdate();
            System.out.println(count);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt, conn);
        }

    }
}
