package com.serviceregistrycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Provider2Application {

	public static void main(String[] args) {
		SpringApplication.run(Provider2Application.class, args);
	}
}
