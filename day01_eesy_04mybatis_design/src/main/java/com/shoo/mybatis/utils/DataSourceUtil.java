package com.shoo.mybatis.utils;


import com.shoo.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 创建数据源的工具类
 */
public class DataSourceUtil {
    public static Connection getConnection(Configuration cfg) {
        try {
            Class.forName(cfg.getDriver());
            return  DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        }  catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
