package com.promineotech.player.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.controller.GetPlayerBolwingStats;
import com.promineotech.player.dao.GetBowlingStatsDao;
import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.PlayerBowlingStats;

@Service
public class defaultGetPlayerBowlingStatsService implements GetPlayerBowlingStatsService {
@Autowired
private GetBowlingStatsDao getBowlingStatsDao;
	
	@Override
	public List<PlayerBowlingStats> getBowlingStatsService(int player_id) {
		// TODO Auto-generated method stub
		List<PlayerBowlingStats> ply= getBowlingStatsDao.getBowlingStats(player_id);
		//log.info("MMM -{}",ply);
		if(ply.isEmpty()) {
			String msg=String.format("Provided role_id %d is invalid", ply);
			throw new NoSuchElementException(msg);
			
		}
		
		return ply;
	}

}
