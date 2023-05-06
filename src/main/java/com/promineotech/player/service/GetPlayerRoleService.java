package com.promineotech.player.service;

import java.util.List;

import com.promineotech.player.entity.Players;

public interface GetPlayerRoleService {

	List<Players> getPlayerRoleDetailsService(String role_name);

}
