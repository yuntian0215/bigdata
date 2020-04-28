package com.haiwai.bigdata.mapper;

import com.haiwai.bigdata.model.BigdataUser;
import com.haiwai.bigdata.model.BigdataUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigdataUserMapper {
    int countByExample(BigdataUserExample example);

    int deleteByExample(BigdataUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BigdataUser record);

    int insertSelective(BigdataUser record);

    List<BigdataUser> selectByExample(BigdataUserExample example);

    BigdataUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BigdataUser record, @Param("example") BigdataUserExample example);

    int updateByExample(@Param("record") BigdataUser record, @Param("example") BigdataUserExample example);

    int updateByPrimaryKeySelective(BigdataUser record);

    int updateByPrimaryKey(BigdataUser record);
}