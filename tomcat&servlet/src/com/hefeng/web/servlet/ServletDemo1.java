package com.hefeng.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Servlet 快速入门
 */
public class ServletDemo1 implements Servlet {
    @Override
    public void init(ServletConfig ServletConfig) {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
