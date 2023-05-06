package com.promineotech.player.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DefaultDeleteBattingStatsDao implements DeleteBattingStatDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public void deleteBattingStats(int player_id) {
		// TODO Auto-generated method stub
		
		String query = " delete from PlayerBattingStats "
			     + " where player_id=:player_id";

Map<String,Object> params=new HashMap<>();

params.put("player_id", player_id);

jdbcTemplate.update(query, params);




	}

}
