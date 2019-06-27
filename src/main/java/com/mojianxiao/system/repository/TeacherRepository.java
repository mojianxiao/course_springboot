package com.mojianxiao.system.repository;

import com.mojianxiao.system.pojo.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,String> {
}
