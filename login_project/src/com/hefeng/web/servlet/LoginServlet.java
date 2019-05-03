package com.hefeng.web.servlet;

import com.hefeng.dao.UserDao;
import com.hefeng.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.设置编码
        req.setCharacterEncoding("utf-8");

        // 2. 获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 3. 封装user对象
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
//        Map<String, String[]> map = req.getParameterMap();
//        //3.创建User对象
//        User loginUser = new User();
//        //3.2使用BeanUtils封装
//        try {
//            BeanUtils.populate(loginUser,map);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }


        // 4. 调用UserDao的login方法
        UserDao dao = new UserDao();
        System.out.println(dao);
        //User user = dao.login(loginUser);

        //System.out.println(user);
        // 5. 判断user
        /*if (user == null) {
            // 登录失败
            req.getRequestDispatcher("/failServlet").forward(req, resp);
        } else {

            // 存储数据
            req.setAttribute("user", user);

            // 转发
            req.getRequestDispatcher("/successServlet").forward(req, resp);
        }*/
        //System.out.println("hello,world");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}