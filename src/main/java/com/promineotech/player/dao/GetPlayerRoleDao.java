package com.promineotech.player.dao;

import java.util.List;

import com.promineotech.player.entity.Players;

public interface GetPlayerRoleDao {

	List<Players> getPlayerRoleDetailsDao(String role_name);

}
