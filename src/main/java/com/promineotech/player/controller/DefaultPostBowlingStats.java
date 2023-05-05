package com.promineotech.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.PlayerBowlingStats;
import com.promineotech.player.entity.Players;
import com.promineotech.player.service.PostBatStatsService;
import com.promineotech.player.service.PostBowlingStatsService;

@RestController
public class DefaultPostBowlingStats implements PostPlayerBowlingStats {

	@Autowired
	private PostBowlingStatsService postBowlingStats;
	@Override
	public PlayerBowlingStats createPlayerBowlerDetails(PlayerBowlingStats players) {
		// TODO Auto-generated method stub
		return postBowlingStats.createPlayerBowlerDetails(players);
	}

}
