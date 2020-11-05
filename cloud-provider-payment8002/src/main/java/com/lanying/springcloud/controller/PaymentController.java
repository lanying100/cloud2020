package com.lanying.springcloud.controller;

import com.lanying.springcloud.entity.CommonResult;
import com.lanying.springcloud.entity.Payment;
import com.lanying.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j // 用于通过log打印日志
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果：", result>0);

        if(result > 0){
            return new CommonResult(200,"插入成功，serverPort: "+serverPort,result);
        }else{
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果：", payment.toString());

        if(payment != null){
            return new CommonResult(200,"查询成功，serverPort: "+serverPort,payment);
        }else{
            return new CommonResult(444,"查询失败，ID:"+id,null);
        }
    }

    // 用于测试自定义的负载均衡算法，通过查看端口号判断是谁在提供服务
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return serverPort;
        }
    }
}
