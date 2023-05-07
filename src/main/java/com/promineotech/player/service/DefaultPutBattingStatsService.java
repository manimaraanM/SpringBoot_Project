package com.promineotech.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.dao.PutPlayerBattingStatsDao;
import com.promineotech.player.entity.PlayerBattingStats;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DefaultPutBattingStatsService implements PutBattingStatsService {
@Autowired
private PutPlayerBattingStatsDao playerbattingdao;

	
	@Override
	public PlayerBattingStats updatePlayerBattingDetailsService(int player_id, int matches, long total_runs,
			long highest_score, long fiftys, long hundreds) {
		// TODO Auto-generated method stub
		return playerbattingdao.updatePlayerBattingDetailsDao(player_id,matches,  total_runs,
				 highest_score,  fiftys,  hundreds);
	}

}
