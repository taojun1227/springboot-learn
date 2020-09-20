package com.jt.learn.autoconfigura;

import com.jt.learn.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Title: SpringbootdemoAutoConfigura </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/19 23:05 </p>
 *
 * @author: jt-ape
 */
@Configuration
@ConditionalOnClass(ConnectionService.class)
@EnableConfigurationProperties(SpringbootdemoProperties.class)
public class SpringbootdemoAutoConfiguration {

    @Autowired
    private SpringbootdemoProperties springbootdemoProperties;

    @Bean
    @ConditionalOnProperty(prefix = "jt.demo", name = "enabled", havingValue = "true")
    public ConnectionService connectionService() {
        ConnectionService connectionService = new ConnectionService();
        connectionService.setName(springbootdemoProperties.getName());
        return connectionService;
    }

}
