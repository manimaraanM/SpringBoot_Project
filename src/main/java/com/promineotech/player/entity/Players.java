package com.promineotech.player.entity;




//import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Players {
	
private int player_id;
private String player_name;
private String team_name;
private int age;
private String birth_place;
private long matches;
private String batting_style;
private String bowling_style;


public int getPlayer_id() {
	return player_id;
}
	
}
