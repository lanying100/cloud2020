package com.lanying.springcloud.alibaba.controller;

import com.lanying.springcloud.alibaba.domain.CommonResult;
import com.lanying.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId,Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功!");
    }
}



