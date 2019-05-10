package com.impl;

import com.dao.ItemsDao;
import com.shoo.domain.Items;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemsDaoImpl implements ItemsDao {

    public List<Items> findAll() {

        // 先获取connection对象
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Items> list = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///eesy", "root", "12345678");
            String sql = "select * from account";
            pstmt = conn.prepareStatement(sql);

             rs = pstmt.executeQuery();

            // 把数据库结果集转成java中的List集合
            list = new ArrayList<Items>();

            while (rs.next()) {
                Items items = new Items();

                items.setId(rs.getInt("id"));
                items.setName(rs.getString("name"));

                list.add(items);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt != null) {
                try {
                    pstmt.close();
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

        return list;
    }
}
