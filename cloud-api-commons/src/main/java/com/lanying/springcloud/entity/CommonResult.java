package com.lanying.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> { // 返回给前端的统一封装体
    // 404 not found
    private Integer code; // 状态码
    private String message; // 描述信息
    private T       data; // 数据（各种类型）

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}


