package com.promineotech.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.dao.PostBatStatsDao;
import com.promineotech.player.entity.PlayerBattingStats;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultPostBatStatsService implements PostBatStatsService {
@Autowired
private PostBatStatsDao postBatStatsDao;
	@Override
	public PlayerBattingStats createBatDtls(PlayerBattingStats players) {
		// TODO Auto-generated method stub
		log.info("DefaultPostBatStatsService");
		return postBatStatsDao.createBatDtls(players);
	}

}
