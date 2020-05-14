package com.zsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = "com.zsw.**")
@EnableEurekaServer
public class EurekaServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServicesApplication.class, args);
	}

}
