package com.promineotech.player.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Controller;

import com.promineotech.player.dao.DefaultPostPlayerDao.SqlParams;
import com.promineotech.player.entity.PlayerBattingStats;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DefaultPostBatStatsDao implements PostBatStatsDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public PlayerBattingStats createBatDtls(PlayerBattingStats players) {
		// TODO Auto-generated method stub
		log.info("Dao layer - {}", players);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParams params = insertStatementforPlayers(players);
		jdbcTemplate.update(params.sql, params.source,keyHolder);
		
		log.info("MMM 1 {}",keyHolder.getKey());
		
		
		int player_id = keyHolder.getKey().intValue();
		
		return players.builder()
				.player_id(player_id)
				.matches(players.getMatches())
				.total_runs(players.getTotal_runs())
				.highest_score(players.getHighest_score())
				.fiftys(players.getFiftys())
				.hundreds(players.getHundreds())
				.build();
	}
	
private SqlParams insertStatementforPlayers(PlayerBattingStats players) {
		
		SqlParams params = new SqlParams();
		params.sql=""
				+ " INSERT INTO nwacricket.PlayerBattingStats ("
				+ " player_id,matches, "
				+ " total_runs,highest_score,fiftys,hundreds) "
				+ " VALUES (:player_id,:matches,"
				+ " :total_runs, :highest_score, :fiftys, :hundreds)";
		
		params.source.addValue("player_id", players.getPlayer_id());
		params.source.addValue("matches", players.getMatches());
		params.source.addValue("total_runs", players.getTotal_runs());
		params.source.addValue("highest_score", players.getHighest_score());
		params.source.addValue("fiftys", players.getFiftys());
		params.source.addValue("hundreds", players.getHundreds());
		
		
		
		return params;
	}
	
	class SqlParams{
		String sql;
		MapSqlParameterSource source=new MapSqlParameterSource();
	}


}
