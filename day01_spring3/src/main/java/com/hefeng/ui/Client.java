package com.hefeng.ui;
import com.hefeng.dao.IAccountDao;
import com.hefeng.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.Resource;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     *  获取spring的Ioc核心容器，并根据id获取对象
     *      ApplicationContext的三个常用实现类：
     *          ClassPathXmlApplication: 它可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了
     *          FileSystemXmlApplication: 它可以加载磁盘任意路径下的配置文件(必须有访问权限)
     *          AnnotationConfigApplicationContext: 用于读取注解创建容器的
     *
     *  核心容器的两个接口引发出的问题
     *      ApplicationContext:  单例对象适用
     *          它在构建核心容器时，创建对象采取的策略: 采用立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象
     *      BeanFactory:    多例对象适用
     *          延迟加载， 什么时候需要根据id获取对象，什么时候才真正创建对象。
     *
     * @param args
     */
    public static void main(String[] args) {
        // 1. 获取核心容器对象
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\michaelhee\\Desktop\\bean.xml");
        // 2. 根据id获取Bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao", IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);*/

        // BeanFactory

    }
}
