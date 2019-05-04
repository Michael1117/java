package com.hefeng.ui;

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
        /*IAccountService as1 = (IAccountService) ac.getBean("accountService");
        IAccountService as2 = (IAccountService) ac.getBean("accountService");

        //System.out.println(as);
        System.out.println(as1 == as2);  // 默认是单例的 true
*/
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.saveAccount();
    }
}
