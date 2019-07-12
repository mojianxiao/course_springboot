package com.mojianxiao.system.service.impl;

import com.mojianxiao.system.pojo.Admin;
import com.mojianxiao.system.pojo.Student;
import com.mojianxiao.system.pojo.Teacher;
import com.mojianxiao.system.repository.AdminRepository;
import com.mojianxiao.system.repository.StudentRepository;
import com.mojianxiao.system.repository.TeacherRepository;
import com.mojianxiao.system.service.LoginService;
import com.mojianxiao.system.tools.Message;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.validator.internal.util.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Aspect
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public Message login(HttpServletRequest request) {
        Message message = new Message();
        Map<String,String> map = new HashMap<>();
        int type = Integer.valueOf(request.getParameter("type"));
        if(type == 0){
            List<Admin> admins = adminRepository.findAll();
            for(Admin admin :admins){
                map.put(admin.getAccount(),admin.getPassword());
            }
        }
        if(type == 1){
            List<Student> students = studentRepository.findAll();
            for(Student student : students){
                map.put(student.getStudentAccount(),student.getStudentPassword());
            }
        }
        if(type == 2){
            List<Teacher> teachers = teacherRepository.findAll();
            for(Teacher teacher : teachers){
                map.put(teacher.getTeacherAccount(),teacher.getTeacherPassword());
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
            if(!(account.equals(entry.getKey())&&password.equals(entry.getValue()))){
                message.setCode("10003");message.setReason("请输入正确的账号和密码");
            }else {
                message.setCode("10000");message.setReason("登录成功");
                return message;
            }
        }
        return message;
    }
    public Message forget(HttpServletRequest request) throws UnknownHostException {
        Message message = new Message();
        String account = request.getParameter("account")!=null?request.getParameter("account"):null;
        String password = request.getParameter("password");
        String secondPAssword = request.getParameter("secondPAssword");
        InetAddress addr = InetAddress.getLocalHost();
        List<Admin> admins = adminRepository.findAll();
        for(Admin admin : admins) {
            if (addr.getHostAddress().equals(admin.getIp()) && account.equals(admin.getAccount())) {
                admin.setPassword(password);
                adminRepository.save(admin);
                if(secondPAssword.equals(password))
                return new Message("1","修改密码成功!");
                return new Message("-1","输入的密码不一致!");
            }
        }
        return new Message("-1","修改密码失败!");
    }
    @Before(value = "execution(* com.mojianxiao.system.controller.LoginController.userLogin(..))")
    public void beforeLogin(){

    }
    @Pointcut()
    public void pointcut(){}
}
