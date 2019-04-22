package com.hefeng.web.download;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取请求参数 文件名称
        String filename = req.getParameter("filename");

        // 2. 使用字节流加载文件进内存

        // 2.1 文件服务器路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);

        // 2.2 用字节流关联
        FileInputStream fis = new FileInputStream(realPath);

        // 3. 设置response 的响应头

        // 3.1 设置响应类型 : content-type
        String mimeType = servletContext.getMimeType(filename);  // 获取文件的mime 类型
        resp.setHeader("content-type", mimeType);
        // 3.2 设置响应头打开方式： content-dispostion
        resp.setHeader("content-disposition", "attachment;filename=" + filename);
        // 4. 将输入流的数据写到输出流中
        ServletOutputStream sos = resp.getOutputStream();
        byte[] buff = new byte[1024 * 8];

        int len = 0;
        while ((len = fis.read(buff)) != -1) {
            sos.write(buff, 0, len);
        }

        fis.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
