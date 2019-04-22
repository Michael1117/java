package com.hefeng.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        int width = 100;
        int height = 50;

        // 1.创建对象，在内存中图片
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // 2.美化图片
        Graphics g = image.getGraphics();
        g.setColor(Color.PINK);
        g.fillRect(0, 0, width, height);

        // 边框

        g.setColor(Color.BLUE);
        g.drawRect(0, 0, width - 1, height - 1);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // 生成随机角标
        Random ran = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 4; i++) {
            int index = ran.nextInt(str.length());

            // 获取字符
            char ch = str.charAt(index);  // 随机字符
            sb.append(ch);
            // 2.3 验证码
            g.drawString(ch + "", width / 5 * i, height / 2);
        }

        String checkCode_session = sb.toString();

        // 将验证码存入session
        req.getSession().setAttribute("checkCode_session", checkCode_session);
        // 2.4 干扰线
        g.setColor(Color.GREEN);


        // 2.5 随机生成坐标点
        for (int i = 1; i <= 10; i++) {
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);

            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);

            g.drawLine(x1, y1, x2, y2);
        }

        // 3. 将图片输出到页面展示
        ImageIO.write(image, "jpg", resp.getOutputStream());

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
