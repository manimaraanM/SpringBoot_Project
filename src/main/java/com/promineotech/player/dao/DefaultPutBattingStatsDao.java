package com.promineotech.player.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;

import com.promineotech.player.entity.PlayerBattingStats;
import java.util.*;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DefaultPutBattingStatsDao implements PutPlayerBattingStatsDao {

	 @Autowired
	  private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public PlayerBattingStats updatePlayerBattingDetailsDao(int player_id, int matches, long total_runs,
			long highest_score, long fiftys, long hundreds) {
		// TODO Auto-generated method stub
		
		//@formatter:off
	     String sql = ""
	         + "UPDATE PlayerBattingStats "
	         + " SET " 
	         + " player_id = :player_id, "
	         + " matches = :matches, "
	         + " total_runs = :total_runs, "
	         + " highest_score = :highest_score, "
	         + " fiftys = :fiftys, "
	         + " hundreds = :hundreds "
	         + " WHERE player_id = :player_id;";
	     //@formatter:on

	    Map<String, Object> params = new HashMap<>();
	    params.put("player_id", player_id);
	    params.put("matches", matches);
	    params.put("total_runs", total_runs);
	    params.put("highest_score", highest_score);
	    params.put("fiftys", fiftys);
	    params.put("hundreds", hundreds);

	    jdbcTemplate.update(sql, params);
	    
	    return PlayerBattingStats.builder()
	    		.player_id(player_id).matches(matches)
	    		.total_runs(total_runs).highest_score(highest_score)
	    		.fiftys(fiftys).hundreds(hundreds)
	    		.build();
	}

}
