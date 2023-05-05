package com.promineotech.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.service.DeleteBattingStatsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultDeleteBattingStats implements DeleteBattingStats {
@Autowired
	private DeleteBattingStatsService deletebattingservice;
	@Override
	public void deleteBattingStats(int player_id) {
		// TODO Auto-generated method stub
		deletebattingservice.deletebattingStats(player_id);

	}

}
