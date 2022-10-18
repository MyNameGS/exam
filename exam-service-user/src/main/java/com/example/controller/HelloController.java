package com.example.controller;

import com.example.api.controller.user.HelloControllerApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloControllerApi {

    @GetMapping("/hello")
    public Object hello() {
        return "hello world!";
    }
}
