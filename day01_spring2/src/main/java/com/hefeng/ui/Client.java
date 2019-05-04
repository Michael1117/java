package com.hefeng.ui;

import com.hefeng.factory.BeanFactory;
import com.hefeng.www.IAccountService;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();
        //IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
        for (int i = 0; i < 5; i++) {
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            //System.out.println(as);
            as.saveAccount();
        }

        //as.saveAccount();
    }
}
