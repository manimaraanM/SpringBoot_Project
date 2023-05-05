package com.promineotech.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.dao.PostBowlingStatsDao;
import com.promineotech.player.entity.PlayerBowlingStats;


@Service
public class DefaultPostBowlingStatsService implements PostBowlingStatsService {

	@Autowired
	private PostBowlingStatsDao postBowlingStats;
	
	@Override
	public PlayerBowlingStats createPlayerBowlerDetails(PlayerBowlingStats players) {
		// TODO Auto-generated method stub
		return postBowlingStats.postBowlingStats(players);
	}

}
