package com.grm.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author grm
 */
@Controller
public class IndexController {


    @RequestMapping("/")
    public Object index() {
        return "index";
    }

    @RequestMapping("/add.html")
    public String add() {
        return "add";
    }
}
