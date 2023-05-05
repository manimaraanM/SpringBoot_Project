package com.promineotech.player.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.service.PutBattingStatsService;

public class DefaultPutBattingStat implements PutBattingStats {
@Autowired
private PutBattingStatsService putBattingstats;
	@Override
	public PlayerBattingStats updatePlayerBattingDetails(int player_id, int matches, long total_runs) {
		// TODO Auto-generated method stub
		return putBattingstats.updatePlayerBattingDetailsService(player_id,matches,total_runs);
	}

}
