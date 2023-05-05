package com.promineotech.player.service;

import java.util.List;

import com.promineotech.player.entity.Players;

public interface GetPlayerService {

	List<Players> getPlayerDetailsService(String playername);

}
