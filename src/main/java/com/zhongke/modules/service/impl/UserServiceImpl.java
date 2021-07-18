package com.zhongke.modules.service.impl;

import com.zhongke.modules.entity.User;
import com.zhongke.modules.mapper.UserMapper;
import com.zhongke.modules.service.UserService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> selUser() {
        List<User> users = userMapper.selUser();
        return users;
    }
}
