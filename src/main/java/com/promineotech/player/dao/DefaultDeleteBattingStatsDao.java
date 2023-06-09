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
	public void deleteBattingStats(String player_name) {
		// TODO Auto-generated method stub
		
		String query = " delete from PlayerBattingStats "
			     + " where player_id in ( "
				+ " select player_id from players "
			     +" where player_name= :player_name)";

Map<String,Object> params=new HashMap<>();

params.put("player_name", player_name);

jdbcTemplate.update(query, params);




	}

}
