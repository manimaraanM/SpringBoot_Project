package com.promineotech.player.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayerBowlingStats {
	private int player_id;
	private long matches;
	private long total_wickets;
	private String best_bowling;
	private long five_wickets;
	
}
