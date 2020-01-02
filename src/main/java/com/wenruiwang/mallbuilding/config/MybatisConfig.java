package com.wenruiwang.mallbuilding.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.wenruiwang.mallbuilding.mbg.mapper", "com.wenruiwang.mallbuilding.dao"})
public class MybatisConfig {
}
