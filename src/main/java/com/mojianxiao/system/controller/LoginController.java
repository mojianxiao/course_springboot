package com.mojianxiao.system.controller;

import com.mojianxiao.system.pojo.Admin;
import com.mojianxiao.system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/login", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getAllAdmin(Admin admin){
        return adminService.login(admin);
    }
}
