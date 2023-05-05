package com.promineotech.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.player.dao.PostPlayerDao;
import com.promineotech.player.entity.Players;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultPostPlayerService implements PostPlayerService {
@Autowired
private PostPlayerDao postPlayerDao;
	
	@Override
	public Players createPlayerDetailsService(Players players) {
		// TODO Auto-generated method stub
		log.info("Service layer - {}",players);
		return postPlayerDao.createPlayerDetailsDao(players);
	}

}
