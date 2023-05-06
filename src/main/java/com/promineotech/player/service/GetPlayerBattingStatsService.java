package com.promineotech.player.service;

import java.util.List;

import com.promineotech.player.entity.PlayerBattingStats;

public interface GetPlayerBattingStatsService {

	List<PlayerBattingStats> getPlayerBattingStatsService(String Playername);

}
