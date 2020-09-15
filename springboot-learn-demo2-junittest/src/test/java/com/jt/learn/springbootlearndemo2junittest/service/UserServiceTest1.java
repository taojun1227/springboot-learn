package com.jt.learn.springbootlearndemo2junittest.service;

import com.jt.learn.springbootlearndemo2junittest.dao.UserDao;
import com.jt.learn.springbootlearndemo2junittest.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * <p>Title: UserServiceTest1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/14 23:37 </p>
 *
 * @author: jt-ape
 */
@SpringBootTest
public class UserServiceTest1 {
    @Autowired
    UserService userService;

    // 替换 spring 中 userDao
    @MockBean
    UserDao userDao;

    // 在执行每个测试方法之前执行
    @BeforeEach
    void beforeEachTest() {
        // 表示调用userDao.getUser方法传入任何值都返回new User("Tom", 22, "来自Mock返回的数据")
        Mockito.when(userDao.getUser(Mockito.any(String.class)))
                .thenReturn(new User("Tom", 22, "来自Mock返回的数据"));
    }

    @Test
    void test() {
        System.out.println(userService.getUser("mock"));
    }
}
