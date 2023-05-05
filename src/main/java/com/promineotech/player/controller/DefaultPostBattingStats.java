package com.promineotech.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.service.PostBatStatsService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class DefaultPostBattingStats implements PostPlayerBattingStats {
@Autowired
private PostBatStatsService postBatStats;
	@Override
	public PlayerBattingStats createPlayerBattingDetails(PlayerBattingStats players) {
		// TODO Auto-generated method stub
		log.info("DefaultPostBattingStats Controller player_id - {}",players);
		return postBatStats.createBatDtls(players);
	}

}
