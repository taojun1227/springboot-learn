package com.jt.learn.springbootlearndemo2junittest.annotation;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>Title: AnnotationTest </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/15 14:24 </p>
 *
 * @author: jt-ape
 */
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AnnotationTest {

    @BeforeAll
    public void beforeAllTest() {
        System.out.println("+++++++++++执行 BeforeAll +++++++++++++");

    }
    @BeforeEach
    public void beforeEachTest() {
        System.out.println("+++++++++++执行 BeforeEach +++++++++++++");
    }

    @Test
    public void test1() {
        System.out.println("======== 执行test1 =========");
    }

    @Test
    public void test2() {
        System.out.println("======== 执行test2 =========");
    }
}
