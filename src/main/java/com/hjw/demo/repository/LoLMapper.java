package com.hjw.demo.repository;

import com.hjw.demo.admain.Player;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 黄毅 on 2017/8/22.
 */
@Component
@Mapper
public interface LoLMapper {

    public List<Player> login(@Param("num") String num);

    public List<Player> queryAllPlayer(@Param("num") String num);
}
