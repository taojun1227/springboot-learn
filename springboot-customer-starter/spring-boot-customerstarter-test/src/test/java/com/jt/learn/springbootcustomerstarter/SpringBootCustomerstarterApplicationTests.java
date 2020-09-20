package com.jt.learn.springbootcustomerstarter;

import com.jt.learn.service.ConnectionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootCustomerstarterApplicationTests {

    @Autowired
    private ConnectionService connectionService;

    @Test
    void contextLoads() {
        System.out.println(connectionService.connect());
    }

}
