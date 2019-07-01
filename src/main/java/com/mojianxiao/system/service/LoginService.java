package com.mojianxiao.system.service;

import com.mojianxiao.system.pojo.Admin;
import com.mojianxiao.system.repository.AdminRepository;
import com.mojianxiao.system.tools.Message;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;
import java.util.List;

public interface LoginService {
    public Message login(HttpServletRequest request);
    public Message forget(HttpServletRequest request) throws UnknownHostException;

}
