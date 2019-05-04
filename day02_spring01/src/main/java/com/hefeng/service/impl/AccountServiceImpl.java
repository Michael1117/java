package com.hefeng.service.impl;

import com.hefeng.dao.IAccountDao;
import com.hefeng.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
 *          Autowired:
 *              作用： 自动按照类型注入。只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功
 *          出现位置：
 *              可以是变量上，也可以是方法上
 *           细节：
 *              在使用注解注入时，set就不是必须得了
 *
 *          Qualifier:
 *              作用： 在按照类中注入的基础之上再按照名称注入。它在给类成员注入时不能单独使用。但是在给方法参数注入时可以。
 *               属性： 用于指定注入bean的id
 *          Resource
 *              作用： 直接按照bean的id注入。它可以独立使用
 *              属性：
 *                  name：用于指定bean的id
 *          以上三个注入都只能注入其他bean类型的数据，而基本类型和String类型无法使用上述注解实现。
 *          另外，集合类型的注解只能通过XML实现
 *          Vaule:
 *              作用： 用于注入基本类型和String类型的数据
 *              属性：
 *                  value: 用于指定数据的值。它可以使用spring中的SpEl(spring的el表达式)
 *                              SpEl的写法： ${表达式}
 *  用于改变作用范围的
 *              Scope
 *                  作用： 用于指定bean的作用范围
 *                  属性：
 *                        value: 指定范围的取值。常用取值： singleton prototype
 *  和生命周期相关的
 *
 * */

//@Component(value = "accountService")
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    //  如果是经常变化的数据，并不适用于注入的方式

   /* @Autowired
    @Qualifier("accountDao1")*/
   @Resource(name = "accountDao1")
    private IAccountDao accountDao = null;

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    public void saveAccount() {

        //System.out.println("service中的saveAccount方法执行了");
        accountDao.saveAccount();

    }

}
