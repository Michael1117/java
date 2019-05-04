package com.hefeng.test;

import com.hefeng.domain.Account;
import com.hefeng.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用Junit单元测试： 测试我们的配置
 */
public class AccountServiceTest {
    @Test
    public void testFindAll() {
        // 1. 获取容器
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // 2. 得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);

        // 3. 执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account: accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {

            // 1. 获取容器
            ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
            //ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
            // 2. 得到业务层对象
            IAccountService as = ac.getBean("accountService", IAccountService.class);

            // 3. 执行方法
            Account account = as.findAccountById(1);
            System.out.println(account);


    }
    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(12345f);
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);

        // 3. 执行方法
        as.saveAccount(account);

    }
    @Test
    public void testUpdate() {
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);

        // 3. 执行方法
        Account account = as.findAccountById(4);
        account.setMoney(23456f);
        as.updateAccount(account);

    }
    @Test
    public void testDelete() {
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);

        // 3. 执行方法
        Account account = as.findAccountById(1);
        as.deleteAccount(4);

    }
}
