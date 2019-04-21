package com.hefeng.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo6")
public class RequestDemo6 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // post 获取请求参数

        // 根据参数名称获取参数值
        String username = req.getParameter("username");
        System.out.println("post");
        System.out.println(username);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get 获取请求参数

        /*String username = req.getParameter("username");
        System.out.println("get");
        System.out.println(username);*/
        this.doPost(req, resp);
    }
}
