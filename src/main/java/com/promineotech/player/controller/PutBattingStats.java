package com.promineotech.player.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.PlayerBowlingStats;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/updateBatting")
@Validated
public interface PutBattingStats {
	//@formatter:off
		@Operation(
				summary = "Service to update Player Batting Details",
				description = "Service to update Player Batting Details",
				responses = {
						@ApiResponse(
								responseCode = "201",
								description = "Playing batting details updated",
								content = @Content(
								mediaType = "application/json", 
								schema=@Schema(implementation=PlayerBowlingStats.class))
								),
						@ApiResponse(
								responseCode="400",
								description = "Request parameters are invalid ",
								content = @Content(
								mediaType = "application/json ")
								),
						@ApiResponse(
								responseCode = "404",
								description = " No data found for input ",
								content = @Content(
								mediaType = "application/json ")),
						@ApiResponse(
								responseCode = "500",
								description = "Service unavaiable",
								content = @Content(
								mediaType = "application/json "))
				}

				)
		//@formatter:on
	
	@PutMapping
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	PlayerBattingStats updatePlayerBattingDetails(@RequestBody PlayerBattingStats players);
	
}
