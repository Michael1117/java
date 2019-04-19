package com.hefeng.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {
    public static void main(String[] args) {
        //String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/itcast?useSSL=false&serverTimezone=Asia/Shanghai";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "12345678";

        try {
            //Class.forName(DB_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();

            String sql = "update student set salary=5000 where id=1";

            //statement.execute("USE `world`");
            int count = statement.executeUpdate(sql);

            System.out.println(count);
            statement.close();
            connection.close();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }


    }
}