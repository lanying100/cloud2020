package com.lanying.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced // 1.赋予RestTemplate负载均衡的能力，轮询访问Provider集群中的每一台机器 2.通过服务名称找到IP
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
