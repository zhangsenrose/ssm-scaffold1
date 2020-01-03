package com.ash.cn.controller;

import com.ash.cn.pojo.SysUser;
import com.ash.cn.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {


    @Resource
    private IUserService userService;


    @RequestMapping(method = RequestMethod.GET, value = "/getUser")
    @ResponseBody
    public SysUser getUser(Long id) {
        return  userService.getUserByUserId(id);
    }


}
