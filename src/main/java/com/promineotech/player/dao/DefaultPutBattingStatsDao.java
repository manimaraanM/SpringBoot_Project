package com.promineotech.player.dao;

import org.springframework.stereotype.Controller;

import com.promineotech.player.entity.PlayerBattingStats;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DefaultPutBattingStatsDao implements PutPlayerBattingStatsDao {

	@Override
	public PlayerBattingStats updatePlayerBattingDetailsDao(int player_id, int matches, long total_runs) {
		// TODO Auto-generated method stub
		return null;
	}

}
