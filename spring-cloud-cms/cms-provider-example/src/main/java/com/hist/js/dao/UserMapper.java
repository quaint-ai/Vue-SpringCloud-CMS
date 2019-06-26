package com.hist.js.dao;


import com.hist.js.pojo.example.Users;

public interface UserMapper {

    Users selectByPrimaryKey(Integer userId);

}
