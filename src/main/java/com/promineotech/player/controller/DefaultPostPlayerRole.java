package com.promineotech.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.PlayerRole;
import com.promineotech.player.service.PostPlayerRoleService;

@RestController
public class DefaultPostPlayerRole implements PostPlayerRole {
@Autowired
private PostPlayerRoleService playerRoles;
	@Override
	public PlayerRole createPlayerRoles(PlayerRole player_roles) {
		// TODO Auto-generated method stub
		return playerRoles.createPlayerRoles(player_roles);
	}

}
