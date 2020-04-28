package com.haiwai.bigdata.controller;/**
 * @author: lvjie
 * @date: 2020/4/26 20:03
 * @description: 用户
 */

import com.haiwai.bigdata.common.utils.CommonResult;
import com.haiwai.bigdata.dto.UserLoginParam;
import com.haiwai.bigdata.model.BigdataResources;
import com.haiwai.bigdata.model.BigdataUser;
import com.haiwai.bigdata.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: lvjie
 * @date: 2020/4/26 20:03
 * @description: 用户
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    /**
     * 用户注册
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<BigdataUser> register(@RequestBody BigdataUser userParam, BindingResult result) {
        BigdataUser user = userService.register(userParam);
        if (user == null) {
            CommonResult.failed();
        }
        return CommonResult.success(user);
    }
    /**
     * 登录以后返回token
     */
    @SuppressWarnings("rawtypes")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UserLoginParam userLoginParam, BindingResult result) {
        String token = userService.login(userLoginParam.getUserName(), userLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }
    /**
     * 获取用户所有权限（包括+-权限）
     */
    @RequestMapping(value = "/permission/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<BigdataResources>> getPermissionList(@PathVariable Integer userId) {
        List<BigdataResources> resourcesList = userService.getResourcesList(userId);
        return CommonResult.success(resourcesList);
    }
}
