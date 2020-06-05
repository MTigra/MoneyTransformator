package com.example.unitconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroserviceUnitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceUnitServiceApplication.class, args);
	}
}

