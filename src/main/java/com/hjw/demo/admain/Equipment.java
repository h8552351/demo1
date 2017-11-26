package com.hjw.demo.admain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 黄毅 on 2017/8/22.
 */
@Data
public class Equipment implements Serializable {
    private String id;
    private String type;
    private String name;
    private Role role;

    public Equipment(){}

    public Equipment(String id,String type,String name,Role role){
        this.id = id;
        this.type = type;
        this.name = name;
        this.role = role;
    }
}
