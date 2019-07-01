package com.mojianxiao.system.repository;

import com.mojianxiao.system.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    List<Admin> getByLastNameStartingWithAndIdLessThan(String lastName, Integer id);
}
