package com.mojianxiao.system.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
@Entity
@Table(name = "admin")
@Getter
@Setter
@Data
public class Admin implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String account;
    private String password;
    private String ip;
    private String username;

}
