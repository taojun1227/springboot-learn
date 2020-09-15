package com.jt.learn.springbootlearndemo2junittest.controller;

import com.jt.learn.springbootlearndemo2junittest.model.User;
import com.jt.learn.springbootlearndemo2junittest.service.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * <p>Title: SayController </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/14 15:39 </p>
 *
 * @author: jt-ape
 */
@RestController
public class SayController {

    @Autowired
    private SayService sayService;

    @RequestMapping("/hello")
    public String hello(@RequestBody User user) {
        return sayService.sayHello(user);
    }
}
