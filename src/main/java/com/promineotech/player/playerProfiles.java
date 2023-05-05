package com.promineotech.player;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication()
public class playerProfiles {

	public static void main(String [] args) {
		SpringApplication.run(playerProfiles.class,args);
	log.info("Starting app");
	}
	
}
