package com.jt.learn.springbootlearndemo2junittest.service;

import com.jt.learn.springbootlearndemo2junittest.model.User;

/**
 * <p>Title: UserService </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/14 22:47 </p>
 *
 * @author: taojun
 */
public interface UserService {
    public User getUser(String name);

    public User getUser(String name, Integer age);
}
