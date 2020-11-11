package com.lanying.springcloud.service.impl;

import com.lanying.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Service;

/**
 * 以方法重写的方式为每个方法定制fallback
 */
@Service
public class PaymentFallbackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackServiceImpl fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackServiceImpl fall back paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
