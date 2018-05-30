package com.sharearn.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.sharearn.dubbo.consumer.service.TestServiceForComsum;
import com.sharearn.dubbo.romote.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by deepbay on 2018/5/30.
 */

@Controller
public class TestController {

    @Autowired
    TestServiceForComsum testServiceForComsum;

    @ResponseBody
    @RequestMapping("/test/{name}")
    public JSONObject testJson(@PathVariable("name") String name) {
        JSONObject jsonObject = new JSONObject();
        String testStr = testServiceForComsum.sayHello(name);
        jsonObject.put("str",testStr);
        return jsonObject;

    }
}
