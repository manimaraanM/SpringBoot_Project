package com.promineotech.player.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Roles {
private int role_id;
private String role_name;

@JsonIgnore
public int getRole_id() {
	return role_id;
}
	
}
