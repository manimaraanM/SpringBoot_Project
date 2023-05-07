package com.promineotech.player.dao;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.PlayerBowlingStats;

public interface PutBowlingStatsDao {

	PlayerBowlingStats updatePlayerBowlingDetailsDao(int player_id, long matches, long total_wickets,
			String best_bowling, long five_wickets);

}
