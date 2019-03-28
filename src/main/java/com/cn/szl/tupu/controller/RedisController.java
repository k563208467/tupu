package com.cn.szl.tupu.controller;

import com.cn.szl.tupu.service.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *@Description: redis 测试
 */
@Controller
@RequestMapping("/redisTest")
public class RedisController {

    @Autowired
    RedisUtil redisUtil;

    /**
     *@Description: 测试redis
     *@return Object
     */
    @RequestMapping("/testRedisAdd")
    @ResponseBody
    Object testRedisAdd(String key,String value){
        redisUtil.set(key,value);
        return redisUtil.get(key);
    }

}

