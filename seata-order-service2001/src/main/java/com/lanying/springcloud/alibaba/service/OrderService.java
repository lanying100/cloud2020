package com.lanying.springcloud.alibaba.service;

import com.lanying.springcloud.alibaba.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}

