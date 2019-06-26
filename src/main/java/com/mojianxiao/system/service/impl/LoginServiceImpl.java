package com.mojianxiao.system.service.impl;

import com.mojianxiao.system.pojo.Admin;
import com.mojianxiao.system.repository.AdminRepository;
import com.mojianxiao.system.service.LoginService;
import com.mojianxiao.system.tools.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public Message login(int type,HttpServletRequest request) {
        Map<String,String> map = new HashMap<>();
        if(type == 0){
            List<Admin> admins = adminRepository.findAll();
            for(Admin admin :admins){
                map.put(admin.getAccount(),admin.getPassword());
            }
        }
        String account = request.getParameter("account")!=null?request.getParameter("account"):null;
        String password = request.getParameter("password")!=null?request.getParameter("password"):null;
        if(account == null ||  account.equals(""))
            return new Message("10001","账号不能为空");
        if(password == null || password.equals("")){
            return new Message("10002","密码不能为空");
        }
        for(Map.Entry<String,String> entry : map.entrySet()){
            if(!account.equals(entry.getKey())){
            return new Message("10003","请输入正确账号");
            }
            if(!password.equals(entry.getValue())){
                return new Message("1004","请输入正确的密码");
            }
        }
        return new Message("10000","登录成功");
    }
}
