package com.idat.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class IdatmicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdatmicroservicioApplication.class, args);
	}

}
