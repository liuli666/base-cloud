package com.cloud.micro.microeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  Run成功之后访问： http://localhost:7001/
 *  本服务启动成功之后作为Erueka服务的注册中心
 */
@SpringBootApplication
@EnableEurekaServer // 激活Eureka服务相关配置
public class MicroEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroEurekaApplication.class, args);
	}

}
