package com.promineotech.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.Players;
import com.promineotech.player.service.PostPlayerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultPostPlayer implements PostPlayer {
@Autowired
private PostPlayerService postPlayerService;
	@Override
	public Players createPlayerDetails(Players players) {
		// TODO Auto-generated method stub
		log.info("Post Controller - {}",players);
		return postPlayerService.createPlayerDetailsService(players);
		

	}

}
