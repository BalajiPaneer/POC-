package com.sample.configDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigDbApplication.class, args);
	}

}
