package com.promineotech.player.service;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.PlayerBowlingStats;

public interface PutBowlingStatsService {

	PlayerBowlingStats updatePlayerBowlingDetailsService(int player_id, long matches, long total_wickets,
			String best_bowling, long five_wickets);

}
