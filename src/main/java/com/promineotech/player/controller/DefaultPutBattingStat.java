package com.promineotech.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.service.PutBattingStatsService;

@RestController
public class DefaultPutBattingStat implements PutBattingStats {
@Autowired
private PutBattingStatsService putBattingstats;
	
	@Override
	public PlayerBattingStats updatePlayerBattingDetails(PlayerBattingStats players) {
		// TODO Auto-generated method stub
		return putBattingstats.updatePlayerBattingDetailsService(players.getPlayer_id(),
				players.getMatches(),players.getTotal_runs(),players.getHighest_score(),players.getFiftys(),players.getHundreds());
	}

}
