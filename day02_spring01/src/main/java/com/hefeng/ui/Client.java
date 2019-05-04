package com.hefeng.ui;

import com.hefeng.dao.IAccountDao;
import com.hefeng.service.IAccountService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // 1. 获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        // 2. 根据id获取Bean对象

        IAccountService as = (IAccountService) ac.getBean("accountService");
        //IAccountService as = (IAccountService) ac.getBean("accountServiceImpl");  // Component后不加(value)
        //System.out.println(as);

        //IAccountDao adao = ac.getBean("accountDao", IAccountDao.class);

        //System.out.println(adao);
        as.saveAccount();

    }
}
