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

@RequestMapping("/deleteplayerbowling")
@Validated
public interface DeleteBowlingStats {
	//@formatter:off
		@Operation(
				summary = "Service to Delete Player Bowling Details",
				description = "Service to Delete Player Bowling Details",
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
								name = "Player_name",
								allowEmptyValue = false, 
								required=false, 
								description = "Player_name")
				}	
				)
		//@formatter:on
	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	void deleteBowlingStats(@RequestParam String Player_name);
}
