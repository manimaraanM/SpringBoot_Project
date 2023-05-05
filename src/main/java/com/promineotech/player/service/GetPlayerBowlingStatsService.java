package com.promineotech.player.service;

import java.util.List;

import com.promineotech.player.entity.PlayerBowlingStats;

public interface GetPlayerBowlingStatsService {

	List<PlayerBowlingStats> getBowlingStatsService(int player_id);

}
