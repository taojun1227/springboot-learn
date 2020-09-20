package com.jt.learn.autoconfigura;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>Title: SpringbootdemoProperties </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/19 23:10 </p>
 *
 * @author: jt-ape
 */
@ConfigurationProperties(prefix = "jt.demo")
public class SpringbootdemoProperties {
    private String name;
    private boolean enabled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

