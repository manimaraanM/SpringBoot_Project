package com.promineotech.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.service.DeleteBattingStatsService;
import com.promineotech.player.service.DeleteBowlingStatsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultDeleteBowlingStats implements DeleteBowlingStats {
@Autowired
	private DeleteBowlingStatsService deletebowlingservice;
	
	@Override
	public void deleteBowlingStats(String Player_name) {
		// TODO Auto-generated method stub
		deletebowlingservice.deletebowlingStats(Player_name);
	}

}
