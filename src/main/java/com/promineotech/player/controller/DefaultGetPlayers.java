package com.promineotech.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.player.entity.Players;
import com.promineotech.player.service.GetPlayerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DefaultGetPlayers implements GetPlayer {
@Autowired
private GetPlayerService getplayerservice;
	@Override
	public List<Players> getPlayerDetails(String Playername) {
		// TODO Auto-generated method stub
		log.info("Controller playername - {}",Playername);
		return getplayerservice.getPlayerDetailsService(Playername);
	}

}
