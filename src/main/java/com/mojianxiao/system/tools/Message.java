package com.mojianxiao.system.tools;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Message {
    private String code;
    private String reason;
    //构造方法
    public Message(){}

    public Message(String code, String reason){
        this.code = code;
        this.reason = reason;
    }
}
