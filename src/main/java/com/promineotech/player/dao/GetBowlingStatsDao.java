package com.promineotech.player.dao;

import java.util.List;

import com.promineotech.player.entity.PlayerBowlingStats;

public interface GetBowlingStatsDao {

	List<PlayerBowlingStats> getBowlingStats(String Playername);

}
