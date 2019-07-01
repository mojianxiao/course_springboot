package com.mojianxiao.system.controller;

import com.mojianxiao.system.service.LoginService;
import com.mojianxiao.system.tools.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/login", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public Message userLogin(HttpServletRequest request){
            Message message = loginService.login(request);
            return message;
    }
    @RequestMapping(value = "/forget", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public Message userForget(HttpServletRequest request) throws Exception{
        Message message = loginService.forget(request);
        return message;
    }
}
