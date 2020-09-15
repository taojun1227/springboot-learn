package com.jt.learn.springbootlearndemo2junittest.annotation;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

/**
 * <p>Title: AnnotationTest1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/15 15:01 </p>
 *
 * @author: jt-ape
 */
@SpringBootTest
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class AnnotationTest1 {

    @Test
    @Order(2)
    public void test1() {
        System.out.println("======== 执行test1 =========");
    }

    @Disabled
    @Test
    @Order(1)
    public void test2() {
        System.out.println("======== 执行test2 =========");
    }
}
