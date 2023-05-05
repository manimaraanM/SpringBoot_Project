package com.promineotech.player.controller;


import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.player.entity.Players;

@RequestMapping("/createPlayer")
@Validated
public interface PostPlayer {

	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	Players createPlayerDetails(@RequestBody Players players);
}
