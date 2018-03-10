package com.tenelema.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tenelema")
@EnableDiscoveryClient
public class MicroEstudianteApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroEstudianteApplication.class, args);
	}
}
