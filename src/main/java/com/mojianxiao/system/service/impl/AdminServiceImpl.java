package com.mojianxiao.system.service.impl;

import com.mojianxiao.system.pojo.Admin;
import com.mojianxiao.system.repository.AdminRepository;
import com.mojianxiao.system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }
}
