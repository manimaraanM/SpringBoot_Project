package com.promineotech.player.controller;


import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.player.entity.Players;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@RequestMapping("/players")
@Validated
@OpenAPIDefinition(info = @Info(title="Player Details Service"), servers = {
		@Server(url = "http://localhost:8080",description = "local server")})
public interface GetPlayer {

	//@formatter:off
	@Operation(
			summary = "Service to get Player Details",
			description = "Service to Fetch Player Details",
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "List of Players is returned",
							content = @Content(
							mediaType = "application/json", 
							schema=@Schema(implementation=Players.class))
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
							name = "Playername",
							allowEmptyValue = false, 
							required=false, 
							description = "Player name like Sachin")
					
			}

			)
	//@formatter:on
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	List<Players> getPlayerDetails(@RequestParam 
			(required=false) 
			 String Playername);
}




