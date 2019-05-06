package com.example.demo.biz.service.impl;

import com.example.demo.biz.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @Auther: wangkui
 * @Date: 2019/5/6 16:21
 * @Description:
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String test() {
        return "Hello world!";
    }
}