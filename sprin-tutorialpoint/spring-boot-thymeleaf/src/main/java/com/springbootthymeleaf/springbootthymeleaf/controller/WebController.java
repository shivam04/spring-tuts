package com.springbootthymeleaf.springbootthymeleaf.controller;

/*
 * Date: 01/05/2020 - 1:00 pm
 * User: shivam.si
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
