package com.shoo.mybatis.io;

import javax.annotation.Resource;
import java.io.InputStream;

/**
 * 使用类加载器读取配置文件的类
 */
public class Resources {
    /**
     * 根据传入的参数，获取一个字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath) {
        // 1. 当前类的字节码  Resource.class
        // 2.  字节码的类的加载器 Resource.class.getClassLoader()
        // 3. 根据类的加载器来读取配置  Resource.class.getClassLoader().getResourceAsStream(filePath)
        return Resource.class.getClassLoader().getResourceAsStream(filePath);
    }
}
