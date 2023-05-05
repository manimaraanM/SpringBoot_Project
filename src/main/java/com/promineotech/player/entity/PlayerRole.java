package com.promineotech.player.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PlayerRole {
	private int role_id;
	private int player_id;

}
