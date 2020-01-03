package com.ash.cn.service;

import com.ash.cn.pojo.SysUser;

public interface IUserService {
    SysUser getUserByUserId(long userId);
}
