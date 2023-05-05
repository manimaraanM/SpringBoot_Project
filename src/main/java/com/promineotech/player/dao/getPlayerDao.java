package com.promineotech.player.dao;

import java.util.List;

import com.promineotech.player.entity.Players;

public interface getPlayerDao {

	List<Players> getPlayerDetailsDao(String playername);

}
