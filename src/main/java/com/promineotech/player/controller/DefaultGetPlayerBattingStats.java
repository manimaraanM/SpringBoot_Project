package com.promineotech.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.service.GetPlayerBattingStatsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultGetPlayerBattingStats implements GetPlayerBattingStats {

	@Autowired
	private GetPlayerBattingStatsService playerBattingstats;
	@Override
	public List<PlayerBattingStats> getPlayerBattingStats(String Playername) {
		// TODO Auto-generated method stub
		
		log.info("DefaultGetPlayerBattingStats Controller player_id - {}",Playername);
		
		List<PlayerBattingStats> ply= playerBattingstats.getPlayerBattingStatsService(Playername);
		log.info("MMM - ply - {}",ply);
		return ply;
	}

}
