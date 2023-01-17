package com.devex.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerPracticeApplication.class, args);
	}

}
