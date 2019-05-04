package com.hefeng.impl;

import com.hefeng.dao.IAccountDao;
import com.hefeng.dao.impl.AccountDaoImpl;
import com.hefeng.factory.BeanFactory;
import com.hefeng.www.IAccountService;

/*
 * 账户的业务层实现类
 * */
public class AccountServiceImpl implements IAccountService {
    //
    // private IAccountDao accountDao = new AccountDaoImpl(); 不通过BeanFactory
    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");


    /*public void saveAccount() {
        int i = 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }*/
    private int i = 1;
    public void saveAccount() {
        int i = 1;
        accountDao.saveAccount();
        //System.out.println(i);
        i++;
    }
}
