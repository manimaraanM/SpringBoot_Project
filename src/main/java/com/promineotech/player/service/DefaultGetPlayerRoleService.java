package com.promineotech.player.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.dao.GetPlayerRoleDao;
import com.promineotech.player.entity.Players;

@Service
public class DefaultGetPlayerRoleService implements GetPlayerRoleService {

	@Autowired
	private GetPlayerRoleDao getPlayerRole;
	@Override
	public List<Players> getPlayerRoleDetailsService(String role_name) {
		// TODO Auto-generated method stub
		List<Players> players=getPlayerRole.getPlayerRoleDetailsDao(role_name);
		if(players.isEmpty()) {
			String msg=String.format("Provided role_id %d is invalid", role_name);
			throw new NoSuchElementException(msg);
			
		}
		return players;
	}

}
