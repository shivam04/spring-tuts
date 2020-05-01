package com.springbootinternationalization.springbootinternationalization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Date: 01/05/2020 - 2:13 pm
 * User: shivam.si
 */

@Controller
public class ViewController {

    @RequestMapping("/locale")
    public String locale() {
        return "locale";
    }
}
