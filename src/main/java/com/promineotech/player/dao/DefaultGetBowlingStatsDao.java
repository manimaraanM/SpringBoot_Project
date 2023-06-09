package com.promineotech.player.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.PlayerBowlingStats;

@Controller
public class DefaultGetBowlingStatsDao implements GetBowlingStatsDao {
@Autowired
private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public List<PlayerBowlingStats> getBowlingStats(String Playername) {
		// TODO Auto-generated method stub
		
	
		String query = " Select pb.* from player_bowling_stats pb, players p "
			     + " where p.player_name=:p.player_name"
			     + " and pb.player_id = p.player_id";
		
		
		Map<String,Object> params=new HashMap<>();
		
		params.put("p.player_name", Playername);
		
		return jdbcTemplate.query(query, params, new RowMapper<>() {

				@Override
				public PlayerBowlingStats mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					return PlayerBowlingStats.builder()
							.player_id(rs.getInt("player_id"))
						    .matches(rs.getInt("matches"))
						    .total_wickets(rs.getLong("total_wickets"))
						    .best_bowling(rs.getString("best_bowling"))
						    .five_wickets(rs.getLong("five_wickets"))
							.build();
				}});
	}

}
