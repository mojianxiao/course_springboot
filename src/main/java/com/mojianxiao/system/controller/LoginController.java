package com.mojianxiao.system.controller;

import com.mojianxiao.system.service.LoginService;
import com.mojianxiao.system.tools.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/login", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public Message userLogin(int type, HttpServletRequest request){
        if(type == 0){
            return loginService.login(type,request);
        }
        return null;
    }
    @RequestMapping("/hello")
    public String hello(){
        return "login.html";
    }
}
