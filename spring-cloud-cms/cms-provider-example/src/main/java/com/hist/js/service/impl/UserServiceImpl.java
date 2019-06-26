package com.hist.js.service.impl;

import com.hist.js.dao.UserMapper;
import com.hist.js.pojo.example.Users;
import com.hist.js.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Users selectByPrimaryKey(Integer userId){
        return userMapper.selectByPrimaryKey(userId);
    }
}
