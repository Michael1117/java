package com.hefeng.web.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContext5")
public class ServletContext5 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过HttpServlet 获取
        ServletContext context = this.getServletContext();

        // 获取文件的服务器路径
        String realPath = context.getRealPath("/b.txt");
        System.out.println(realPath);
        //File file = new File(realPath);

        String c = context.getRealPath("/WEB-INF/c.txt");
        System.out.println(c);

        String a = context.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(a);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
