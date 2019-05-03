package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    @Override
    public boolean regist(User user) {

        // 1. 保存用户名查询用户对象
        User u = userDao.findByUsername(user.getUsername());
        if (u != null) {
            // 用户存在，保存失败
            return  false;
        }
        // 2. 保存用户对象
        userDao.save(user);
        return true;
    }
}
