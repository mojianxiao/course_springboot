package com.mojianxiao.system.pojo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Entity
@Table(name = "admin")
public class Admin implements Serializable{
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private Integer id;
    private String account;
    private String password;
    private String ip;
}
