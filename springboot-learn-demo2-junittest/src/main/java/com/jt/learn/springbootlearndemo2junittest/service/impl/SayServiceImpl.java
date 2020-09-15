package com.jt.learn.springbootlearndemo2junittest.service.impl;

import com.jt.learn.springbootlearndemo2junittest.model.User;
import com.jt.learn.springbootlearndemo2junittest.service.SayService;
import org.springframework.stereotype.Service;

/**
 * <p>Title: SayServiceImpl </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/14 15:52 </p>
 *
 * @author: jt-ape
 */
@Service
public class SayServiceImpl implements SayService {

    public SayServiceImpl() {
        System.out.println("=====================  SayServiceImpl 实例化 ===========================");
    }
    @Override
    public String sayHello(User user) {
        return "hello!"+ user.getName()+"&"+user.getAge()+"&"+user.getAddress();
    }
}
