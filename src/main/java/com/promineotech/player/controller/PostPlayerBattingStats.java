package com.promineotech.player.controller;


import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.Players;

@RequestMapping("/createPlayerBatting")
@Validated
public interface PostPlayerBattingStats {

	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	PlayerBattingStats createPlayerBattingDetails(@RequestBody PlayerBattingStats players);
}
