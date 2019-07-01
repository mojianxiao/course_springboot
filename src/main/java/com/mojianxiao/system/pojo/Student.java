package com.mojianxiao.system.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "student")
@Getter
@Setter
@Data
public class Student {
    @Id
    private String studentAccount;
    private String studentPassword;
    private String studentName;
    private String sex;
    private Integer age;
    private String date;
    private Integer sort;
}
