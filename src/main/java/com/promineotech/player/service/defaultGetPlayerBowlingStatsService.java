package com.promineotech.player.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.controller.GetPlayerBowlingStats;
import com.promineotech.player.dao.GetBowlingStatsDao;
import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.PlayerBowlingStats;

@Service
public class defaultGetPlayerBowlingStatsService implements GetPlayerBowlingStatsService {
@Autowired
private GetBowlingStatsDao getBowlingStatsDao;
	
	@Override
	public List<PlayerBowlingStats> getBowlingStatsService(String Playername) {
		// TODO Auto-generated method stub
		List<PlayerBowlingStats> players= getBowlingStatsDao.getBowlingStats(Playername);
		//log.info("MMM -{}",ply);
		if(players.isEmpty()) {
			String msg=String.format("Provided player %s name is invalid", Playername);
			throw new NoSuchElementException(msg);
			
		}
		
		
		return players;
	}

}
