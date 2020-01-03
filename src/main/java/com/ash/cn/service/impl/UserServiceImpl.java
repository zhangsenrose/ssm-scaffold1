package com.ash.cn.service.impl;

import com.ash.cn.dao.SysUserMapper;
import com.ash.cn.pojo.SysUser;
import com.ash.cn.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private SysUserMapper userMapper;

    @Override
    public SysUser getUserByUserId(long userId) {
        SysUser user = userMapper.selectByPrimaryKey(userId);
        return user;
    }
}
