package com.promineotech.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.PlayerBowlingStats;
import com.promineotech.player.service.PutBattingStatsService;
import com.promineotech.player.service.PutBowlingStatsService;

@RestController
public class DefaultPutBowlingStats implements PutBowlingStats {
@Autowired
private PutBowlingStatsService putBowlingstats;
	
	@Override
	public PlayerBowlingStats updatePlayerBowlingDetails(PlayerBowlingStats players) {
		// TODO Auto-generated method stub
		return putBowlingstats.updatePlayerBowlingDetailsService(players.getPlayer_id(),
				players.getMatches(),players.getTotal_wickets(),players.getBest_bowling(),players.getFive_wickets());
	}

}
