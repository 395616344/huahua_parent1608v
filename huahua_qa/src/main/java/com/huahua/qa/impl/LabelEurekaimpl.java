package com.huahua.qa.impl;

import com.huahua.qa.eureka.LabelEureka;
import huahua.common.Result;
import huahua.common.StatusCode;
import org.springframework.stereotype.Component;

/**
 * Created by Ricky on 2019/5/5.
 */
@Component
public class LabelEurekaimpl implements LabelEureka{
    @Override
    public Result findById(String id) {
        return new Result(StatusCode.ERROR,false,"熔断器已启动");
    }
}
