package com.mojianxiao.system.controller;

import com.mojianxiao.system.pojo.Admin;
import com.mojianxiao.system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private AdminService adminService;
    @GetMapping(value = "/login",produces = {"application/json;charset=UTF-8"})
    public void getAllAdmin(){
        List<Admin> allAdmin = adminService.getAllAdmin();
        for(Admin admin : allAdmin){
            System.out.println(admin);
        }
    }
}
