package com.jt.learn.springbootlearndemo2junittest.dao.impl;

import com.jt.learn.springbootlearndemo2junittest.dao.UserDao;
import com.jt.learn.springbootlearndemo2junittest.model.User;
import org.springframework.stereotype.Repository;

/**
 * <p>Title: UserDaoImpl </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/14 22:45 </p>
 *
 * @author: jt-ape
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User getUser(String name) {
        return new User(name, 19, "来自dao方法返回的数据");
    }

    @Override
    public User getUser(String name, Integer age) {
        return new User(name, age, "来自dao方法返回的数据");
    }
}
