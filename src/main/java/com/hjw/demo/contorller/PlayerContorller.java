package com.hjw.demo.contorller;

import com.hjw.demo.admain.Player;
import com.hjw.demo.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 黄毅 on 2017/8/23.
 */
@Controller
@Slf4j
public class PlayerContorller {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/login")
    public String login(ModelMap modelMap){
        List<Player> players = playerService.login("nilaicai");
        log.info(players.toString());
        modelMap.put("players", players);
        return "index";
    }

    @PostMapping("/query")
//    @GetMapping("/query")
    public @ResponseBody List<Player> queryAllPlayer(ModelMap modelMap){
        List<Player> players = playerService.queryAllPlayer("");
        log.info(players.toString());
//        modelMap.put("players",players);
        return players;
    }
}
