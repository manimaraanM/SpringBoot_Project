package com.promineotech.player.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;

import com.promineotech.player.entity.Players;

@Controller
public class DefaultGetPlayerRoleDao implements GetPlayerRoleDao {
@Autowired
private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public List<Players> getPlayerRoleDetailsDao(String role_name) {
		// TODO Auto-generated method stub
		String query = " Select p.* from players p, player_role pr,roles r "
				+  " where r.role_name = :r.role_name"
				+ " and r.role_id =pr.role_id "
				+ " and p.player_id= pr.player_id ";
	
	Map<String,Object> params=new HashMap<>();
	
	params.put("r.role_name", role_name);
	
	
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
