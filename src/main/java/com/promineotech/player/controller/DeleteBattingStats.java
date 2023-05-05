package com.promineotech.player.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/deleteplayer")
@Validated
public interface DeleteBattingStats {

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	void deleteBattingStats(@RequestParam int player_id);
}
