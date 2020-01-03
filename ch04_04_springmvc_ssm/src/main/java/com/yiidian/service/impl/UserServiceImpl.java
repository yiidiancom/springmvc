package com.yiidian.service.impl;
import com.yiidian.dao.UserDao;
import com.yiidian.domain.User;
import com.yiidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *业务层实现类
 * 一点教程网 - www.yiidian.com
 */
@Service
public class UserServiceImpl implements UserService{
    //注入Dao对象
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
