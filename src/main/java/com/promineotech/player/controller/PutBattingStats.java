package com.promineotech.player.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.player.entity.PlayerBattingStats;

@RequestMapping("/updateBatting")
@Validated
public interface PutBattingStats {

	@PutMapping
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	PlayerBattingStats updatePlayerBattingDetails(@RequestBody PlayerBattingStats players);
	
}
