package com.hefeng.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo1....");
        // 访问/responseDemo1, 会自动跳转到/responseDemo2资源
        //resp.setStatus(302);
        //resp.setHeader("location","/day15/responseDemo2");

        // 简单的重定向方法
        resp.sendRedirect("/day15/responseDemo2");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }


}
