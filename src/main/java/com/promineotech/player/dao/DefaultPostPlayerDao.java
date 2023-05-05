package com.promineotech.player.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Controller;

import com.promineotech.player.entity.Players;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DefaultPostPlayerDao implements PostPlayerDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public Players createPlayerDetailsDao(Players players) {
		// TODO Auto-generated method stub
		log.info("Dao layer - {}",players);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParams params = insertStatementforPlayers(players);
		jdbcTemplate.update(params.sql, params.source,keyHolder);
		int player_id = keyHolder.getKey().intValue();
	
		log.info("MMM -{}" ,player_id);
		players= players.builder()
				.player_id(player_id)
			    .player_name(players.getPlayer_name())
			    .team_name(players.getTeam_name())
			    .age(players.getAge())
			    .birth_place(players.getBirth_place())
			    .matches(players.getMatches())
			    .batting_style(players.getBatting_style())
			    .bowling_style(players.getBowling_style())
				.build();
		return players;
	}

	private SqlParams insertStatementforPlayers(Players players) {
		
		SqlParams params = new SqlParams();
		params.sql=""
				+ " INSERT INTO nwacricket.players ("
				+ " player_name, team_name,age,birth_place,matches, "
				+ " batting_style,bowling_style) "
				+ " VALUES (:player_name,:team_name,:age,:birth_place,:matches,"
				+ " :batting_style, :bowling_style)";
		
		params.source.addValue("player_name", players.getPlayer_name());
		params.source.addValue("team_name", players.getTeam_name());
		params.source.addValue("age", players.getAge());
		params.source.addValue("birth_place", players.getBirth_place());
		params.source.addValue("matches", players.getMatches());
		params.source.addValue("batting_style", players.getBatting_style());
		params.source.addValue("bowling_style", players.getBowling_style());
		
		
		
		return params;
	}
	
	class SqlParams{
		String sql;
		MapSqlParameterSource source=new MapSqlParameterSource();
	}

}
