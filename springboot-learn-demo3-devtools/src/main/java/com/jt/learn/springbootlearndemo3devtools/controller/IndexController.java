package com.jt.learn.springbootlearndemo3devtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title: IndexController </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/15 17:50 </p>
 *
 * @author: jt-ape
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("say", "hello jsp");
        return "index";
    }
}
