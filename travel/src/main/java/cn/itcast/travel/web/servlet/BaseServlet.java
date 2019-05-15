package cn.itcast.travel.web.servlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@WebServlet("/BaseServlet")
public class BaseServlet extends HttpServlet {
   /* protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }*/

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("baseServlet的service方法被执行了");

        // 完成方法分发

        // 1. 获取请求路径
        String uri = req.getRequestURI();  //  /user/add

        // 2. 获取方法名称
        String methodName = uri.substring(uri.lastIndexOf('/') + 1);
        System.out.println("方法名称" + methodName);

        // 谁调用我， 我指向谁
        // 3. 获取方法对象method

        System.out.println(this);    // UserServlet的对象 cn.itcast.travel.web.servlet.UserServlet@76040af8

        try {
            // 忽略访问修饰符，获取方法
           /* Method method = this.getClass().getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            // 4. 执行方法
            // 暴力反射
            method.setAccessible(true);*/
            // 4. 执行方法
            Method method = this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this,req, resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 直接将传入的对象序列化为json，并且写回客户端
     * @param obj
     */
    public void writeValue(Object obj, HttpServletResponse response) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        response.setContentType("application/json;charset=utf-8");

        mapper.writeValue(response.getOutputStream(), obj);

    }

    /**
     *  将传入的对象序列化为json返回给调用者
     * @param obj
     */
    public String writeValueAsStream(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);

    }
}
