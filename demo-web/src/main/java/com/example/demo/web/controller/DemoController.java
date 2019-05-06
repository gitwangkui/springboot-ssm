package com.example.demo.web.controller;

import com.example.demo.biz.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangkui
 * @Date: 2019/5/6 16:13
 * @Description:
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/conf.test")
    public String test(){
        return  demoService.test();
    }
}