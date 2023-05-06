package com.promineotech.player.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.player.entity.Players;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/playerrole")
@Validated
public interface GetPlayerRole {
	//@formatter:off
		@Operation(
				summary = "Service to get Player Details based on Roles",
				description = "Service to Fetch Player Details based on Roles",
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
								name = "role_name",
								allowEmptyValue = false, 
								required=false, 
								description = "Role name like Batsman/Bowler")
						
				}

				)
		//@formatter:on
		
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	List<Players> getPlayerRoleDetails(@RequestParam 
			(required=false) 
			 String role_name );
	
	
	

}
