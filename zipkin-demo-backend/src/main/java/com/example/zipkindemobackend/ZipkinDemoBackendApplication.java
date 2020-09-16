package com.example.zipkindemobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ZipkinDemoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinDemoBackendApplication.class, args);
	}

}
