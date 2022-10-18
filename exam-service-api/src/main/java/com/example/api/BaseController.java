package com.example.api;

import com.example.utils.RedisOperator;

import javax.annotation.Resource;

public class BaseController {
    @Resource
    public RedisOperator redis;

    public static final String MOBILE_SMSCODE = "mobile:smscode";
}
