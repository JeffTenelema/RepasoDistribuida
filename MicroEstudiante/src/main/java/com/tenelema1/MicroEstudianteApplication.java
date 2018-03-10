package com.tenelema1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tenelema1")
@EnableDiscoveryClient
public class MicroEstudianteApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroEstudianteApplication.class, args);
	}
}
