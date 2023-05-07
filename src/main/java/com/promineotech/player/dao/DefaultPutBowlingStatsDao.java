package com.promineotech.player.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;

import com.promineotech.player.entity.PlayerBowlingStats;

@Controller
public class DefaultPutBowlingStatsDao implements PutBowlingStatsDao {
	@Autowired
	  private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public PlayerBowlingStats updatePlayerBowlingDetailsDao(int player_id, long matches, long total_wickets,
			String best_bowling, long five_wickets) {
		
		
		// TODO Auto-generated method stub
		
		//@formatter:off
	     String sql = ""
	         + "UPDATE player_bowling_stats "
	         + " SET " 
	         + " player_id = :player_id, "
	         + " matches = :matches, "
	         + " total_wickets = :total_wickets, "
	         + " best_bowling = :best_bowling, "
	         + " five_wickets = :five_wickets "
	         + " WHERE player_id = :player_id";
	     //@formatter:on

	    Map<String, Object> params = new HashMap<>();
	    params.put("player_id", player_id);
	    params.put("matches", matches);
	    params.put("total_wickets", total_wickets);
	    params.put("best_bowling", best_bowling);
	    params.put("five_wickets", five_wickets);
	  

	    jdbcTemplate.update(sql, params);
	    
		return PlayerBowlingStats.builder().player_id(player_id).matches(matches)
				.total_wickets(total_wickets)
				.best_bowling(best_bowling)
				.five_wickets(five_wickets).build();
	}

}
