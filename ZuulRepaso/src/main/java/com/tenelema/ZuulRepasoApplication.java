package com.tenelema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulRepasoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulRepasoApplication.class, args);
	}

}