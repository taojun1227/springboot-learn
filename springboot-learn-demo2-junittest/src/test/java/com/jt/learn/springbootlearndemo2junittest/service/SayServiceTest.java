package com.jt.learn.springbootlearndemo2junittest.service;

import com.jt.learn.springbootlearndemo2junittest.model.User;
import com.jt.learn.springbootlearndemo2junittest.service.SayService;
import com.jt.learn.springbootlearndemo2junittest.service.impl.SayServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * <p>Title: SayServiceTest </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/14 16:14 </p>
 *
 * @author: jt-ape
 */
@SpringBootTest
@ContextConfiguration(classes = {SayServiceImpl.class})
public class SayServiceTest {

    @Autowired
    private SayService sayService;

    @Test
    void test() {
        String result = sayService.sayHello(new User("Tom", 18, "大风车"));
        Assertions.assertEquals(result, "hello!Tom&18&大风车");
    }
}
