package com.promineotech.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.PlayerBowlingStats;
import com.promineotech.player.service.GetPlayerBowlingStatsService;

@RestController
public class DefaultGetPlayerBowlingStats implements GetPlayerBowlingStats {
@Autowired
private GetPlayerBowlingStatsService getPlayerBowlingStatsService;
	@Override
	public List<PlayerBowlingStats> getPlayerBowlingStats(String Playername) {
		// TODO Auto-generated method stub
		return getPlayerBowlingStatsService.getBowlingStatsService(Playername);
	}

}
