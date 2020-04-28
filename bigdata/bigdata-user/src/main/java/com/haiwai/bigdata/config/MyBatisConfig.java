package com.haiwai.bigdata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lvjie
 * @date: 2020/4/26 16:08
 * @description: MyBatis配置类
 */
@Configuration
@MapperScan({"com.haiwai.bigdata.mapper","com.haiwai.bigdata.dao"})
public class MyBatisConfig {
}
