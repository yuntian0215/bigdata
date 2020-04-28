package com.haiwai.bigdata.service.impl;

import com.haiwai.bigdata.common.utils.JwtTokenUtil;
import com.haiwai.bigdata.dao.UserRoleRelationDao;
import com.haiwai.bigdata.mapper.BigdataUserMapper;
import com.haiwai.bigdata.model.*;
import com.haiwai.bigdata.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: lvjie
 * @date: 2020/4/26 19:56
 * @description: 用户
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private BigdataUserMapper userMapper;
    @Autowired
    private UserRoleRelationDao userRoleRelationDao;
    @Override
    public BigdataUser getUserByUserName(String userName) {
        BigdataUserExample example = new BigdataUserExample();
        example.createCriteria().andUserNameEqualTo(userName);
        List<BigdataUser> userList = userMapper.selectByExample(example);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public BigdataUser register(BigdataUser userParam) {
        BigdataUser user = new BigdataUser();
        BeanUtils.copyProperties(userParam, user);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setState(1);
        //查询是否有相同用户名的用户
        BigdataUserExample example = new BigdataUserExample();
        example.createCriteria().andUserNameEqualTo(user.getUserName());
        List<BigdataUser> userList = userMapper.selectByExample(example);
        if (userList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        userMapper.insert(user);
        return user;
    }

    @Override
    public String login(String userName, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public List<BigdataResources> getResourcesList(Integer userId) {
        return userRoleRelationDao.getResourcesList(userId);
    }
}
