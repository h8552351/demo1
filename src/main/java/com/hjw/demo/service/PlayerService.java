package com.hjw.demo.service;

import com.hjw.demo.admain.Player;

import java.util.List;

/**
 * Created by 黄毅 on 2017/8/23.
 */
public interface PlayerService {

    public List<Player> login(String num);

    public List<Player> queryAllPlayer(String num);
}
