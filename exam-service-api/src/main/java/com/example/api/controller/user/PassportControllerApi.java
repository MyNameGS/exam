package com.example.api.controller.user;

import com.example.grace.result.GraceJSONResult;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

public interface PassportControllerApi {

    @GetMapping("/getSMSCode")
    public GraceJSONResult getSMSCode(String mobile, HttpServletRequest request);
}
