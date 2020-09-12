package com.jt.springbootlearndemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: SpringBootLearnDemo1Application </p>
 *
 * <p>Description:  启动类</p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/12 12:46 </p>
 *
 * @author: jt-ape
 */
@SpringBootApplication
@RestController
public class SpringBootLearnDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnDemo1Application.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {

        return "hello springboot";
    }
}
