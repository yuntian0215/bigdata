package com.haiwai.bigdata.mapper;

import com.haiwai.bigdata.model.BigdataResources;
import com.haiwai.bigdata.model.BigdataResourcesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigdataResourcesMapper {
    int countByExample(BigdataResourcesExample example);

    int deleteByExample(BigdataResourcesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BigdataResources record);

    int insertSelective(BigdataResources record);

    List<BigdataResources> selectByExample(BigdataResourcesExample example);

    BigdataResources selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BigdataResources record, @Param("example") BigdataResourcesExample example);

    int updateByExample(@Param("record") BigdataResources record, @Param("example") BigdataResourcesExample example);

    int updateByPrimaryKeySelective(BigdataResources record);

    int updateByPrimaryKey(BigdataResources record);
}