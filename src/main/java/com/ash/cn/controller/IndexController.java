package com.ash.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {


    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String login() {
        return "login";
    }



}
