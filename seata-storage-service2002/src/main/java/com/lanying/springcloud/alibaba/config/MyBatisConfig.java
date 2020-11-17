package com.lanying.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.lanying.springcloud.alibaba.dao"})
public class MyBatisConfig {


}



