package com.lanying.springcloud.service;

import com.lanying.springcloud.entity.CommonResult;
import com.lanying.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") // 要访问的服务名称
public interface PaymentFeignService {

    @GetMapping(value="/payment/get/{id}") // 个人理解：与服务提供者的Controller里配置一致，表示消费者的Controller中调用getPaymentById方法时访问对应的url
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}