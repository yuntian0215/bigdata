package com.haiwai.bigdata.dao;


import com.haiwai.bigdata.model.BigdataResources;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 */
public interface UserRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<BigdataResources> getResourcesList(@Param("userId") Integer userId);
}
