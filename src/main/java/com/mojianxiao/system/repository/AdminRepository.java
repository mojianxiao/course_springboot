package com.mojianxiao.system.repository;

import com.mojianxiao.system.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
