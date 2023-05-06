package com.promineotech.player.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.player.entity.PlayerBattingStats;
import com.promineotech.player.entity.Players;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/deleteplayer")
@Validated
public interface DeleteBattingStats {
	//@formatter:off
		@Operation(
				summary = "Service to Delete Player Batting Details",
				description = "Service to Delete Player Batting Details",
				responses = {
						@ApiResponse(
								responseCode = "201",
								description = "Player Deleted Succesfully",
								content = @Content(
								mediaType = "application/json", 
								schema=@Schema(implementation=PlayerBattingStats.class))
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
				},
				parameters = {
						@Parameter(
								name = "player_id",
								allowEmptyValue = false, 
								required=false, 
								description = "player_id")
				}	
				)
		//@formatter:on
	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	void deleteBattingStats(@RequestParam int player_id);
}
