package com.promineotech.player.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.promineotech.player.dao.getPlayerDao;
import com.promineotech.player.entity.Players;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DefaultGetPlayerService implements GetPlayerService {
	
@Autowired
private getPlayerDao getplayerdao;

@Transactional(readOnly=true)
	@Override
	public List<Players> getPlayerDetailsService(String playername) {
		// TODO Auto-generated method stub
		log.info("Service - {}",playername);
		
		List<Players> players=getplayerdao.getPlayerDetailsDao(playername);
		if(players.isEmpty()) {
			String msg=String.format("Provided player %s name is invalid", playername);
			throw new NoSuchElementException(msg);
			
		}
		return players;
	}

}
