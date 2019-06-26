package com.hist.js.service;


import com.hist.js.pojo.example.Users;

public interface UserService {

    Users selectByPrimaryKey(Integer userId);

}
