package com.hjw.demo.service;

import com.hjw.demo.admain.Player;
import com.hjw.demo.repository.LoLMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 黄毅 on 2017/8/23.
 */
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private LoLMapper lolDao;

    @Override
    public List<Player> login(String num) {
        List<Player> players = lolDao.login(num);
        return lolDao.login(num);
    }

    @Override
    public List<Player> queryAllPlayer(String num) {
        return lolDao.queryAllPlayer(num);
    }
}
