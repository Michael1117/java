package com.hefeng.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo8")
public class RequestDemo8 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("demo8888被访问了。。。。。。");

        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("/requestDemo9");

        //requestDispatcher.forward(req, resp);
         // 转发之前  存储数据到request域中
        req.setAttribute("msg", "hello");
        req.getRequestDispatcher("/requestDemo9").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
