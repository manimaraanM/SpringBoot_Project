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
	public PlayerBattingStats updatePlayerBattingDetailsService(PlayerBattingStats players) {
		// TODO Auto-generated method stub
		return playerbattingdao.updatePlayerBattingDetailsDao(players);
	}

}
