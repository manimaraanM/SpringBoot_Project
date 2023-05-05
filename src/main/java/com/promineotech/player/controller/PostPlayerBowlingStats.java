package com.promineotech.player.controller;


import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.player.entity.PlayerBowlingStats;
import com.promineotech.player.entity.Players;

@RequestMapping("/createPlayerBowling")
@Validated
public interface PostPlayerBowlingStats {

	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	PlayerBowlingStats createPlayerBowlerDetails(@RequestBody PlayerBowlingStats players);
}
