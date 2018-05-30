package com.sharearn.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sharearn.dubbo.romote.TestService;
import org.springframework.stereotype.Component;

/**
 * Created by deepbay on 2018/5/30.
 */

@Component
public class TestServiceForComsum {

    @Reference(version = "1.0.0")
    private TestService testService;

    /**
     * 创建一个方法
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return testService.sayHello(name);
    }
}
