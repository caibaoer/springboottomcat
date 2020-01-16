package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc：
 * @title：TestController
 * @author: huangwencai
 * @date: 2020-01-16 13:52
 * @version: v4.40.0
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String t(){
        return "test OK";
    }
}