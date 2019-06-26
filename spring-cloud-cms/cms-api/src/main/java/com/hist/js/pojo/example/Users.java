package com.hist.js.pojo.example;

import lombok.Data;

import java.util.Date;

/**
 * 用户个人信息实体类
 * quaint 2019年1月17日13:40:25
 * version 1.0
 */
@Data
public class Users {

    private Integer userId;
    //用户名,账号
    private String userName;
    //用户密码
    private String userPwd;
    //用户邮箱
    private String userEmail;
    //用户昵称  默认与账号一样
    private String userNickName;
    /*
     * -------上面为注册必填--------
     */
    //用户头像
    private String userImageUrl;

    private String userSays;

    private String userPhone;

    private Byte userSex;

    private String userQq;

    private String userAddress;

    private String userLastLoginIp;

    private Date userBirthday;
    //用户自我描述
    private String userDescription;

    private String userSchool;

    private Date userRegisterTime;

    private String userRegisterIp;

    private Byte userLock;

    private Byte userFreeze;

    //--------------扩展使用,临时存放数据----------------

    private String code;    //验证码,存放的错误信息返回到界面
    private String type;    //判断登录的是新博客还是旧博客

    //带参构造
    public Users(Integer userId) {
        this.userId = userId;
    }
    public Users(Integer userId,String code) {
        this.userId = userId;
        this.code = code;
    }
    //无参构造
    public Users() {
    }
}