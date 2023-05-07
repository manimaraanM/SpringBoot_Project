package com.promineotech.player.service;

import com.promineotech.player.entity.PlayerBattingStats;

public interface PutBattingStatsService {

	

	PlayerBattingStats updatePlayerBattingDetailsService(int player_id, int matches,long total_runs,long highest_score,long fiftys,long hundreds);

}
