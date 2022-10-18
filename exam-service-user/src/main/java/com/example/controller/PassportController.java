package com.example.controller;

import com.example.api.BaseController;
import com.example.api.controller.user.PassportControllerApi;
import com.example.grace.result.GraceJSONResult;
import com.example.utils.IPUtil;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class PassportController extends BaseController implements PassportControllerApi {


    @Override
    public GraceJSONResult getSMSCode(String mobile, HttpServletRequest request) {
//        String userIp = IPUtil.getRequestIp(request);
//        redis.setnx60s(MOBILE_SMSCODE + ":" + userIp, userIp);

        return GraceJSONResult.ok();
    }
}
