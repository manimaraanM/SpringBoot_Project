package com.promineotech.player.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class DefaultDeleteBowlingStatsDao implements DeleteBowlingStatsDao {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public void deletebowlingStats(String player_name) {
		// TODO Auto-generated method stub
	
	String query = " delete from player_bowling_stats "
		     + " where player_id in ( "
			+ " select player_id from players "
		     +" where player_name= :player_name)";

Map<String,Object> params=new HashMap<>();

params.put("player_name", player_name);

jdbcTemplate.update(query, params);
	}

}
