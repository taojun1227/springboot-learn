package com.jt.learn.springbootlearndemo2junittest.service.impl;

import com.jt.learn.springbootlearndemo2junittest.model.User;
import com.jt.learn.springbootlearndemo2junittest.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * <p>Title: DemoServiceImpl </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/14 16:37 </p>
 *
 * @author: jt-ape
 */
@Service
public class DemoServiceImpl implements DemoService {

    public DemoServiceImpl() {
        System.out.println("=====================  DemoServiceImpl 实例化 ===========================");
    }
    @Override
    public User getUser() {
        User user = new User("jack", 25, "火星");
        return user;
    }
}
