package com.hjw.demo.admain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 黄毅 on 2017/8/22.
 */
@Data
public class Player implements Serializable {
    private Integer id;
    private String num;//账号;
    private String code;
    private String name;

    public Player(){}

    public Player(String num,String code,String name){
        this.num = num;
        this.code = code;
        this.name = name;
    }
}
