package com.lanying.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced // 赋予RestTemplate负载均衡的能力，轮训访问Provider集群中的每一台机器
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
