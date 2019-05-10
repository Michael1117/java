package com.hefeng.config;
import lombok.Data;

import java.util.List;

//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;
    User user = new User();

    class User{
        String name;
        int age;
        List<String> language;
    }
}
