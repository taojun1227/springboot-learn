package com.jt.learn.springbootlearndemo2junittest.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * <p>Title: SayControllerTest1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/15 12:54 </p>
 *
 * @author: jt-ape
 */
@SpringBootTest
public class SayControllerTest1 {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @BeforeEach
    public  void beforeEachTest() {
        // 必须初始化mock
        MockitoAnnotations.initMocks(this);
        // 创建MockMvc实例
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void test() throws Exception {
        MvcResult mvcResult = mockMvc.perform(
                // 模拟一个请求
                MockMvcRequestBuilders.post("/hello")
                        //定义客户端希望接受到的数据
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        // 定义客户端发送的数据格式
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        // 请求的参数
                        .content("{\"name\":\"Tom\",\"age\":\"22\",\"address\":\"来自Mock模拟请求的数据\"}")
        )
                //期望响应状态码为200
                .andExpect(MockMvcResultMatchers.status().isOk())
                //期望返回的数据
                .andExpect(MockMvcResultMatchers.content().string("hello!Tom&22&来自Mock模拟请求的数据"))
                // 接收返回结果
                .andReturn();

        System.out.println(mvcResult.getResponse().getContentAsString());
    }
}
