package com.promineotech.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.dao.DeleteBowlingStatsDao;

@Service
public class DefaultDeleteBowlingStatsService implements DeleteBowlingStatsService {
@Autowired
private DeleteBowlingStatsDao deletebowlingstats;
	@Override
	public void deletebowlingStats(String player_name) {
		// TODO Auto-generated method stub
		deletebowlingstats.deletebowlingStats(player_name);
	}

}
