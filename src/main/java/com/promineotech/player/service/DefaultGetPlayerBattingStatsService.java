package com.promineotech.player.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.promineotech.player.controller.GetPlayerBattingStats;
import com.promineotech.player.dao.GetBattingStatsDao;

import com.promineotech.player.entity.PlayerBattingStats;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DefaultGetPlayerBattingStatsService implements GetPlayerBattingStatsService {

	@Autowired
	private GetBattingStatsDao getBattingStatsDao;
	
	@Transactional(readOnly=true)

	@Override
	public List<PlayerBattingStats> getPlayerBattingStatsService(String Playername) {
		// TODO Auto-generated method stub
		log.info("defaultGetPlayerBattingStatsService - {}",Playername);
		List<PlayerBattingStats> players= getBattingStatsDao.getBattingStats(Playername);
		log.info("MMM -{}",players);
		if(players.isEmpty()) {
			String msg=String.format("Provided player %s name is invalid", Playername);
			throw new NoSuchElementException(msg);
			
		}
		
		
		return players;
	}

}
