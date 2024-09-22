package com.sample.apiGatewayDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class ApiGatewayDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayDbApplication.class, args);
	}

}
