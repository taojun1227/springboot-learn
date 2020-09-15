package com.jt.learn.springbootlearndemo2junittest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * <p>Title: SayControllerTest2 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/15 13:51 </p>
 *
 * @author: jt-ape
 */
//配置本地随机端口
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//WebTestClient 自动配置
@AutoConfigureWebTestClient
public class SayControllerTest2 {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void test() {
        //模拟 一个post请求
        EntityExchangeResult<String> result = webTestClient.post().uri("/hello")
                //设置客户端请求发送的数据类型
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                //设置客户端请求接收的数据类型
                .accept(MediaType.APPLICATION_JSON_UTF8)
                //设置客户端请求的数据
                .bodyValue("{\"name\":\"Tom\",\"age\":\"22\",\"address\":\"来自Mock模拟请求的数据\"}")
                //发送请求
                .exchange()
                // 期望返回的状态码
                .expectStatus().isOk()
                // 期望返回的数据类型和内容
                .expectBody(String.class).isEqualTo("hello!Tom&22&来自Mock模拟请求的数据")
                // 返回结果
                .returnResult();

        System.out.println("返回结果：" + result.getResponseBody());
    }

}
