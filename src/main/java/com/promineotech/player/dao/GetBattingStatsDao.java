package com.promineotech.player.dao;

import java.util.List;

import com.promineotech.player.entity.PlayerBattingStats;

public interface GetBattingStatsDao {

	List<PlayerBattingStats> getBattingStats(String Playername);

}
