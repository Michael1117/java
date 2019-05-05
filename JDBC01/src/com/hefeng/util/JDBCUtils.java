package com.hefeng.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC 工具类  Arrays Connections Math : 工具类所有的方法都是静态的，方便调用
 */
public class JDBCUtils {
    private static String url;
    private static String user;
    private static String passwrod;
    private static String driver;

    /**
     * 文件的读取，只需要读取一次即可拿到这些值。使用静态代码块(随着类的加载而加载，只会加载一次)
     *
     */
    static {
        // 读取资源文件，获取值
        try {
            // 1. 创建 Properties 集合类
            Properties pro = new Properties();

            // 获取src路径下的文件的方式  ---- ClassLoader 类加载器(可以加载字节码文件进内存，而且可以获取src下的资源路径)
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();

            URL res = classLoader.getResource("jdbc.properties");

            String path = res.getPath();
            System.out.println(path);   // /D:/java/JDBC01/out/production/JDBC01/jdbc.properties

            // 2. 加载文件
            //pro.load(new FileReader("src/jdbc.properties"));
            pro.load(new FileReader(path));
            // 3. 获取属性，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            passwrod = pro.getProperty("password");
            driver = pro.getProperty("driver");

            // 注册驱动
            Class.forName(driver);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    /**
     * 获取连接
     *
     * @return 连接对象
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, passwrod);
    }

    // 传什么参数 ，就释放谁
    public static void close(Statement stmt, Connection conn) {

        // 两种情况
        // 执行增删改的时候，需要释放Connection 和 Statement 两个对象
        // 执行查询的时候，需要释放三个资源对象ResultSet , Connection 和 Statement对象
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

    public static void close(ResultSet rs, Statement stmt, Connection conn) {

        // 两种情况
        // 执行增删改的时候，需要释放Connection 和 Statement 两个对象
        // 执行查询的时候，需要释放三个资源对象ResultSet , Connection 和 Statement对象
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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
