package com.jt.learn.springbootlearndemo2junittest.controller;

import com.jt.learn.springbootlearndemo2junittest.model.User;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * <p>Title: SayControllerTest </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/15 11:21 </p>
 *
 * @author: jt-ape
 */
@SpringBootTest
@AutoConfigureMockMvc
public class SayControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {
        MvcResult mvcResult = mockMvc.perform(
                // 模拟一个请求
                MockMvcRequestBuilders.post("/hello")
                         //定义客户端希望接受到的数据
                        .accept(MediaType.APPLICATION_JSON)
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
