package com.promineotech.player.dao;

import java.util.List;
import java.util.Map;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;

import com.promineotech.player.entity.Players;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DefaultGetPlayerDao implements getPlayerDao {
@Autowired
private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public List<Players> getPlayerDetailsDao(String playername) {
		// TODO Auto-generated method stub
		log.info("Dao layer - {}", playername);
		
		String query = " Select * from players "
					+  " where player_name= :player_name";
		
		Map<String,Object> params=new HashMap<>();
		
		params.put("player_name", playername);
		
		
		return jdbcTemplate.query(query, params, 
				new RowMapper<>() {

					@Override
					public Players mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						return Players.builder()
								.player_id(rs.getInt("player_id"))
							    .player_name(rs.getString("player_name"))
							    .team_name(rs.getString("team_name"))
							    .age(rs.getInt("age"))
							    .birth_place(rs.getNString("birth_place"))
							    .matches(rs.getLong("matches"))
							    .batting_style(rs.getString("batting_style"))
							    .bowling_style(rs.getString("bowling_style"))
								.build();
					}});
	}

}
