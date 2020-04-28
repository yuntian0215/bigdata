package com.haiwai.bigdata.dto;

import com.haiwai.bigdata.model.BigdataResources;
import com.haiwai.bigdata.model.BigdataUser;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: lvjie
 * @date: 2020/4/27 16:21
 * @description: SpringSecurity需要的用户详情
 */
@SuppressWarnings("serial")
public class BigdataUserDetails implements UserDetails {
    private BigdataUser umsAdmin;
    private List<BigdataResources> permissionList;

    public BigdataUserDetails(BigdataUser umsAdmin, List<BigdataResources> permissionList) {
        this.umsAdmin = umsAdmin;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return permissionList.stream()
                .filter(permission -> permission.getResourcesCode()!=null)
                .map(permission ->new SimpleGrantedAuthority(permission.getResourcesCode().toString()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return umsAdmin.getState().equals(1);
    }
}
