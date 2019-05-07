package com.hefeng.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
    /*@Autowired
    JdbcProperties jdbcProperties;

    public JdbcConfig(JdbcProperties jdbcProperties) {  // 构造函数的方式注入
        this.jdbcProperties = jdbcProperties;
    }

    @Bean
    public DataSource dataSource(JdbcProperties prop) {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setDriverClassName(prop.getDriverClassName());
        datasource.setUrl(prop.getUrl());
        datasource.setUsername(prop.getUsername());
        datasource.setPassword(prop.getPassword());
        return datasource;
    }*/
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }
}
