package com.spring.cloud.config.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerJdbcApplication.class, args);
	}
	
	//http://localhost:8081/config-client/development
}
