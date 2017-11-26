package com.hjw.demo.admain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 黄毅 on 2017/8/22.
 */
@Data
public class Role implements Serializable {
    private String id;
    private String type;
    private String name;

    public Role(){}

    public Role(String id,String type,String name){
        this.id = id;
        this.type = type;
        this.name = name;
    }
}
