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

import com.promineotech.player.entity.PlayerBattingStats;


import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DefaultGetBatStatsDao implements GetBattingStatsDao {
@Autowired
private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public List<PlayerBattingStats> getBattingStats(int player_id) {
		
		
		log.info("DefaultGetBatStatsDao - {}",player_id );
		// TODO Auto-generated method stub
		String query = " Select * from PlayerBattingStats "
				     + " where player_id=:player_id";
	
	Map<String,Object> params=new HashMap<>();
	
	params.put("player_id", player_id);
	
	log.info("DefaultGetBatStatsDao - {} - {} ",query,params);
	
	return jdbcTemplate.query(query, params, 
			new RowMapper<>() {

				@Override
				public PlayerBattingStats mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					return PlayerBattingStats.builder()
							.player_id(rs.getInt("player_id"))
						    .matches(rs.getInt("matches"))
						    .total_runs(rs.getLong("total_runs"))
						    .fiftys(rs.getLong("fiftys"))
						    .hundreds(rs.getLong("hundreds"))
							.build();
				}});
}
	}


