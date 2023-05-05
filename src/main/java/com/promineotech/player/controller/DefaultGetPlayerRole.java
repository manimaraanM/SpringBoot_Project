package com.promineotech.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.Players;
import com.promineotech.player.service.GetPlayerRoleService;

@RestController
public class DefaultGetPlayerRole implements GetPlayerRole {

	@Autowired
	private GetPlayerRoleService getPlayerrole;
	@Override
	public List<Players> getPlayerRoleDetails(int role_id) {
		// TODO Auto-generated method stub
		return getPlayerrole.getPlayerRoleDetailsService(role_id);
	}

}
