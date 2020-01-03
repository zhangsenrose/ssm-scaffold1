package com.ash.cn.controller;

import com.ash.cn.pojo.SysUser;
import com.ash.cn.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);


    @Resource
    private IUserService userService;


    @RequestMapping(method = RequestMethod.GET, value = "/getUser")
    @ResponseBody
    public SysUser getUser(Long id) {
        log.info("进入控制器端....");
        log.info("参数为：{}", id);
        return  userService.getUserByUserId(id);
    }


}
