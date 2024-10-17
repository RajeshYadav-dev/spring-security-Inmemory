package com.sec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TestController {

    @GetMapping("register")
    public String register(){
        return "Register Here...";
    }
    @GetMapping("user")
    public String user(){
        return "user Here...";
    }
    @GetMapping("admin")
    public String admin(){
        return "admin Here...";
    }
}
