package com.jt.learn.springbootlearndemo04mybatis;

import com.jt.learn.springbootlearndemo04mybatis.mapper.UserMapper;
import com.jt.learn.springbootlearndemo04mybatis.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootLearnDemo04MybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.queryList();
        users.stream().forEach(user -> {
            System.out.println(user.getName()+":"+user.getAge()+":"+user.getEmail());
        });
    }

}
