package com.promineotech.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.dao.DeleteBattingStatDao;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultDeleteBattingStatsService implements DeleteBattingStatsService {

	@Autowired
	private DeleteBattingStatDao deletebattingDao;
	@Override
	public void deletebattingStats(String player_name) {
		// TODO Auto-generated method stub
		deletebattingDao.deleteBattingStats(player_name);
	}

}
