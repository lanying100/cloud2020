package com.lanying.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;
// 这个接口主要是为了获取当前访问的这个服务集群中有多少台服务器实例
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}


