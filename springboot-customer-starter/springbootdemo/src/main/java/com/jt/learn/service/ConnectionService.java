package com.jt.learn.service;

/**
 * <p>Title: ConnectionService </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/19 22:43 </p>
 *
 * @author: jt-ape
 */
public class ConnectionService {
    private String name;

    public String connect() {

        return name + "Spring Boot Starter Connection Success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
