package com.lanying.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule mySelfRule() { // 这个方法的名字（bean的id）不能和类名重复
        return new RoundRobinRule(); // 定义为轮询
    }

}

