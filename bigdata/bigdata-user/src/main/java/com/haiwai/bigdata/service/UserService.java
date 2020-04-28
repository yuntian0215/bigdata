package com.haiwai.bigdata.service;

import com.haiwai.bigdata.model.*;

import java.util.List;

/**
 * @author: lvjie
 * @date: 2020/4/26 19:56
 * @description: 用户管理
 */
public interface UserService {
    /**
     * 根据用户名获取后台管理员
     */
    BigdataUser getUserByUserName(String userName);

    /**
     * 注册功能
     */
    BigdataUser register(BigdataUser userParam);

    /**
     * 登录功能
     * @param userName 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String userName, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<BigdataResources> getResourcesList(Integer userId);
}
