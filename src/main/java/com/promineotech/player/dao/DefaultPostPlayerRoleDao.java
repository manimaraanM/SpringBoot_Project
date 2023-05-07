package com.promineotech.player.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;

import com.promineotech.player.dao.DefaultPostPlayerDao.SqlParams;
import com.promineotech.player.entity.PlayerRole;


@Controller
public class DefaultPostPlayerRoleDao implements PostPlayerRoleDao {
@Autowired
private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public PlayerRole createPlayerRoleDao(PlayerRole player_roles) {
		// TODO Auto-generated method stub
		
		SqlParams params = insertStatementforPlayers(player_roles);
		jdbcTemplate.update(params.sql, params.source);
	
		return player_roles.builder()
				.player_id(player_roles.getPlayer_id())
				.role_id(player_roles.getRole_id())
				.build();
	}

private SqlParams insertStatementforPlayers(PlayerRole player_roles) {
		
		SqlParams params = new SqlParams();
		params.sql=""
				+ " INSERT INTO player_role ("
				+ " role_id, player_id ) "
				+ " VALUES (:role_id,:player_id )";
	
		params.source.addValue("role_id", player_roles.getRole_id());
		params.source.addValue("player_id", player_roles.getPlayer_id());
		
		
		
		return params;
	}

	class SqlParams{
		String sql;
		MapSqlParameterSource source=new MapSqlParameterSource();
	}
}
