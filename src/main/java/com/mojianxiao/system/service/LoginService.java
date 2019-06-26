package com.mojianxiao.system.service;

import com.mojianxiao.system.pojo.Admin;
import com.mojianxiao.system.tools.Message;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface LoginService {
    public Message login(int type,HttpServletRequest request);
}
