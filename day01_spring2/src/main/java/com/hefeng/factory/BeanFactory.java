package com.hefeng.factory;


import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建Bean对象的工厂
 * Bean: 在计算机英语中，有可重用组件的含义
 *
 */
public class BeanFactory {
    // 定义一个Properties对象

    /*
    // 单例模式
    private static Properties props;
    // 使用静态代码块为Properties对象赋值
    private static Map<String, Object> beans;

    static {
        // 实例化对象
        try {
            props = new Properties();
            // 获取properties 文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            // 实例化容器
            beans = new HashMap<String, Object>();
            // 取出配置文件中所有的Key
            Enumeration keys = props.keys();
            // 遍历枚举
            while (keys.hasMoreElements()) {
                // 取出每个key
                String key = keys.nextElement().toString();
                // 根据key获取value
                String beanPath = props.getProperty(key);
                // 反射创建对象
                Object value = Class.forName(beanPath).newInstance();
                // 把key和value 存入容器中
                beans.put(key, value);

            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    public static Object getBean(String beanName) {
        return beans.get(beanName);
    }


    */


    // 非单例模式
    private static Properties props;


    static {
        // 实例化对象
        try {
            props = new Properties();
            // 获取properties 文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
        }
        catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }


    public static Object getBean(String beanName) {
        Object bean = null;
        try {
            String beanPath = props.getProperty(beanName);
            //System.out.println(beanPath);
            bean = Class.forName(beanPath).newInstance();
            System.out.println(Class.forName(beanPath) + "---------");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(bean + "--------");
        return bean;
    }
}
