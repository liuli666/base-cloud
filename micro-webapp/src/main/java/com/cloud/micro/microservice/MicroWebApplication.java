package com.cloud.micro.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 此服务作为服务提供方
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.cloud.micro")
@EnableFeignClients(basePackages = {"com.cloud.micro"})

public class MicroWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroWebApplication.class, args);
	}

}
