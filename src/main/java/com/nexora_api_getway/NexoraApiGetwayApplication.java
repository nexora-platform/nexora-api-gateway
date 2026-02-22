package com.nexora_api_getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NexoraApiGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexoraApiGetwayApplication.class, args);
	}

}
