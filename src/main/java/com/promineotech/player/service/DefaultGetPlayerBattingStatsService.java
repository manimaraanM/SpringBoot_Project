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
	public List<PlayerBattingStats> getPlayerBattingStatsService(int player_id) {
		// TODO Auto-generated method stub
		log.info("defaultGetPlayerBattingStatsService - {}",player_id);
		List<PlayerBattingStats> ply= getBattingStatsDao.getBattingStats(player_id);
		log.info("MMM -{}",ply);
		if(ply.isEmpty()) {
			String msg=String.format("Provided role_id %d is invalid", ply);
			throw new NoSuchElementException(msg);
			
		}
		
		
		return ply;
	}

}
