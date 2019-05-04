package com.hefeng.test;

import com.hefeng.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用Junit 单元测试， 测试配置
 */
public class AccountServiceTest {
    @Test
    public void testFindAll() {
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        // 2. 得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);

        // 3. 执行方法

        List<Account> accounts = as.findAllAccount();
        for(Account account: accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {

    }
    @Test
    public void testSave() {

    }
    @Test
    public void testUpdate() {

    }
    @Test
    public void testDelete() {

    }
}
