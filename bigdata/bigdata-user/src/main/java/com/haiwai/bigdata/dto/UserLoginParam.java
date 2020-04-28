package com.haiwai.bigdata.dto;


import javax.validation.constraints.NotEmpty;

/**
 * @author: lvjie
 * @date: 2020/4/27 16:53
 * @description: 用户登录参数
 */
public class UserLoginParam {
    @NotEmpty(message = "用户名不能为空")
    private String userName;
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
