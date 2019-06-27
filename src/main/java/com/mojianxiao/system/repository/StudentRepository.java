package com.mojianxiao.system.repository;

import com.mojianxiao.system.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {

}
