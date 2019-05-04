package com.hefeng.service.impl;

import com.hefeng.service.IAccountService;
import org.springframework.stereotype.Component;

import java.util.Date;

/*
 * 账户的业务层实现类
 *  用于创建对象的
 *          component:
 *              作用： 用于把当前类对象存入spring容器中
 *              属性：
 *                  value: 用于指定bean的id。不写时，默认值是当前类名，且首字母改小写
 *          Controller: 一般用在表现层
 *          Service:  一般用在业务层
 *          Repository: 一般用在持久层
 *          以上三个注解的作用和属性与Component是一模一样的
 *          他们三个是spring框架为我们提供的三层使用的注解，使我们的三层对象更加清晰
 *  用于注入数据的
 *  用于改变作用范围的
 *  和生命周期相关的
 *
 * */

@Component(value = "accountService")
public class AccountServiceImpl implements IAccountService {
    //  如果是经常变化的数据，并不适用于注入的方式

    //private IAccountDao accountDao;

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    public void saveAccount() {

        System.out.println("service中的saveAccount方法执行了");

    }

}
