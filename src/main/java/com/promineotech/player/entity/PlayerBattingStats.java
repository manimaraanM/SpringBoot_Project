package com.promineotech.player.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayerBattingStats {
	private int player_id;
	private int matches;
	private long total_runs;
	private long highest_score;
	private long fiftys;
	private long hundreds;
	

}
