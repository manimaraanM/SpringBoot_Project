package com.promineotech.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.dao.PostPlayerRoleDao;
import com.promineotech.player.entity.PlayerRole;

@Service
public class DefaultPostPlayerRoleService implements PostPlayerRoleService {
@Autowired
private PostPlayerRoleDao createPlayerRole;

	@Override
	public PlayerRole createPlayerRoles(PlayerRole player_roles) {
		// TODO Auto-generated method stub
		return createPlayerRole.createPlayerRoleDao(player_roles);
	}

}
