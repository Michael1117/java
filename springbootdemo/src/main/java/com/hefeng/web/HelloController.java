package com.hefeng.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

//@Controller
@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    //@ResponseBody
    public String hello() {
        return "hello, spring boot!";
    }
}
