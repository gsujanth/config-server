package com.sujanth.configserver.conser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConSerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConSerApplication.class, args);
	}

}
