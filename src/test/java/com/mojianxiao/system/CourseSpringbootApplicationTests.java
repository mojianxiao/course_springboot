package com.mojianxiao.system;

import com.mojianxiao.system.pojo.Admin;
import com.mojianxiao.system.pojo.Student;
import com.mojianxiao.system.pojo.Teacher;
import com.mojianxiao.system.repository.AdminRepository;
import com.mojianxiao.system.repository.StudentRepository;
import com.mojianxiao.system.repository.TeacherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Id;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseSpringbootApplicationTests {
    @Autowired
    private AdminRepository adminRepository;
    @Test
    public void test(){
        System.out.println(adminRepository.findById(1).get());
    }
}
