package com.jt.learn.springbootlearndemo3devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootLearnDemo3DevtoolsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLearnDemo3DevtoolsApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {

        return "hello devtools adafdafd";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootLearnDemo3DevtoolsApplication.class);
    }
}
