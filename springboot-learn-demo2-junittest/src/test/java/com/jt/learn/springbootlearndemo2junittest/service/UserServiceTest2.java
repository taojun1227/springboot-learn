package com.jt.learn.springbootlearndemo2junittest.service;

import com.jt.learn.springbootlearndemo2junittest.dao.UserDao;
import com.jt.learn.springbootlearndemo2junittest.model.User;
import com.jt.learn.springbootlearndemo2junittest.service.impl.UserServiceImpl;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

/**
 * <p>Title: UserServiceTest2 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/15 0:00 </p>
 *
 * @author: jt-ape
 */
public class UserServiceTest2 {
    // 创建一个实例 ，且使用@Mock创建的mock会被注入进来
    @InjectMocks
    private UserService userService = new UserServiceImpl();

    // 创建一个mock，会被注入到@InjectMocks修饰的userService
    @Mock
    private UserDao userDao;

    // 每个测试方法运行前执行
    @BeforeEach
    public void BeforeEachTest() {
        System.out.println("============执行 ：@BeforeEach===============");

        // 必须进行初始化或者使用@RunWith(MockitoJUnitRunner.class)则可省略这行代码
        MockitoAnnotations.initMocks(this);
        // 表示调用userDao.getUser方法传入任何值都返回new User("Tom", 22, "来自Mock返回的数据")
        Mockito.when(userDao.getUser(Mockito.any(String.class)))
                .thenReturn(new User("Tom", 22, "来自Mock返回的数据"));
    }

    @BeforeAll
    public static void beforeAll () {
        System.out.println("============执行 ：@BeforeAll===============");
    }

    @Test
    public void test() {
        System.out.println(userService.getUser("mock"));
    }


    @Test
    public void test2() {
        System.out.println("执行test2.。。。。。");
    }
}
