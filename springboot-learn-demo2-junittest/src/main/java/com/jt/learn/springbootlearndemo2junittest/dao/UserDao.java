package com.jt.learn.springbootlearndemo2junittest.dao;

import com.jt.learn.springbootlearndemo2junittest.model.User;

/**
 * <p>Title: UserDao </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/14 22:44 </p>
 *
 * @author: jt-ape
 */
public interface UserDao {

    public User getUser(String name);

    public User getUser(String name,Integer age);
}
