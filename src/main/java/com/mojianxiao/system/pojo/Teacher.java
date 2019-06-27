package com.mojianxiao.system.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teacher")
@Getter
@Setter
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String teacherAccount;
    private String teacherPassword;
    private String teacherName;
    private String teacherSex;
    private String college;

}