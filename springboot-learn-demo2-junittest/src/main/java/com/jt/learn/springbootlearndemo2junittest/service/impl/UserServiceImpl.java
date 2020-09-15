package com.jt.learn.springbootlearndemo2junittest.service.impl;

import com.jt.learn.springbootlearndemo2junittest.dao.UserDao;
import com.jt.learn.springbootlearndemo2junittest.model.User;
import com.jt.learn.springbootlearndemo2junittest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Title: UserServiceImpl </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/14 22:48 </p>
 *
 * @author: jt-ape
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getUser(String name) {
        return userDao.getUser(name);
    }

    @Override
    public User getUser(String name, Integer age) {
        return userDao.getUser(name, age);
    }
}
