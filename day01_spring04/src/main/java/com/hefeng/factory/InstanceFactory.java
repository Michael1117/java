package com.hefeng.factory;

import com.hefeng.service.IAccountService;
import com.hefeng.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类 (该类可能存在于jar包中，我们无法通过修改源码的方式来提供默认构造函数)
 */
public class InstanceFactory {
    public IAccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
