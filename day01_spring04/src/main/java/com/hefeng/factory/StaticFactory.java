package com.hefeng.factory;

import com.hefeng.service.IAccountService;
import com.hefeng.service.impl.AccountServiceImpl;

public class StaticFactory {
    public static IAccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
