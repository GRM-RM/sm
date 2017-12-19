package com.grm.sm.controller;

import com.grm.sm.pojo.Student;
import com.grm.sm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;

import java.util.ArrayList;
import java.util.List;

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
