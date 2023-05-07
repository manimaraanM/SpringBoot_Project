package com.promineotech.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.dao.PutBowlingStatsDao;
import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.PlayerBowlingStats;

@Service
public class DefaultPutBowlingStatsService implements PutBowlingStatsService {
@Autowired
private PutBowlingStatsDao putBowling;
	@Override
	public PlayerBowlingStats updatePlayerBowlingDetailsService(int player_id, long matches, long total_wickets,
			String best_bowling, long five_wickets) {
		// TODO Auto-generated method stub
		return putBowling.updatePlayerBowlingDetailsDao(player_id,matches,total_wickets,best_bowling,five_wickets);
	}
}
