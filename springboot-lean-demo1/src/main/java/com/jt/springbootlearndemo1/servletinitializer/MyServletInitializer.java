package com.jt.springbootlearndemo1.servletinitializer;

import com.jt.springbootlearndemo1.SpringBootLearnDemo1Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>Title: MyServletInitilize </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/12 17:32 </p>
 *
 * @author: jt-ape
 */
public class MyServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootLearnDemo1Application.class);
    }
}
