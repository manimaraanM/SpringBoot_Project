package com.promineotech.player.dao;

import com.promineotech.player.entity.PlayerBattingStats;

public interface PutPlayerBattingStatsDao {

	PlayerBattingStats updatePlayerBattingDetailsDao(int player_id, int matches, long total_runs);

}
