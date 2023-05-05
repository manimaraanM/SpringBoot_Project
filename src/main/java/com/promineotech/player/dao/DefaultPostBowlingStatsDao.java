package com.promineotech.player.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Controller;

import com.promineotech.player.dao.DefaultPostBatStatsDao.SqlParams;

import com.promineotech.player.entity.PlayerBowlingStats;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DefaultPostBowlingStatsDao implements PostBowlingStatsDao {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public PlayerBowlingStats postBowlingStats(PlayerBowlingStats players) {
		// TODO Auto-generated method stub
		
		log.info("Dao layer - {}", players);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParams params = insertStatementforPlayers(players);
		jdbcTemplate.update(params.sql, params.source,keyHolder);
		
		log.info("MMM");
		
		log.info("MMM 1 {}",keyHolder.getKey());
		jdbcTemplate.update(params.sql, params.source,keyHolder);
		log.info("MMM 2");
		//int player_id = keyHolder.getKey().intValue();
	//	int player_id = keyHolder.getKey().intValue();
	//log.info("MMM  3 player_id {}",keyHolder.getKey().intValue());
		
		
		return players.builder()
				.player_id(5)
				.matches(players.getMatches())
				.total_wickets(players.getTotal_wickets())
				.best_bowling(players.getBest_bowling())
				.five_wickets(players.getFive_wickets())
				.build();
	
	}
	
private SqlParams insertStatementforPlayers(PlayerBowlingStats players) {
		
		SqlParams params = new SqlParams();
		params.sql=""
				+ " INSERT INTO nwacricket.player_bowling_stats ("
				+ " player_id, matches, total_wickets, best_bowling, five_wickets) "
				+ " VALUES (:player_id, :matches, :total_wickets, :best_bowling, :five_wickets)";
			
		
		params.source.addValue("player_id", players.getPlayer_id());
		params.source.addValue("matches", players.getMatches());
		params.source.addValue("total_wickets", players.getTotal_wickets());
		params.source.addValue("best_bowling", players.getBest_bowling());
		params.source.addValue("five_wickets", players.getFive_wickets());
		
		return params;
	}

	class SqlParams{
		String sql;
		MapSqlParameterSource source=new MapSqlParameterSource();
	}


}
