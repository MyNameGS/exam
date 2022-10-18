package com.example.api.controller.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "hello测试" , tags = {"用于测试的controller"})
public interface HelloControllerApi {


    @ApiOperation(value = "hello方法", notes = "hello方法", httpMethod = "GET")
    public Object hello();
}
