package com.hefeng.service.impl;

import com.hefeng.dao.IAccountDao;
import com.hefeng.dao.impl.AccountDaoImpl;

import com.hefeng.service.IAccountService;

/*
 * 账户的业务层实现类
 * */
public class AccountServiceImpl implements IAccountService {
    //
    private IAccountDao accountDao = new AccountDaoImpl();
    public  AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void saveAccount() {

        accountDao.saveAccount();

    }
}
