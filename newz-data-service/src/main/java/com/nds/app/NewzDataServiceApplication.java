package com.nds.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan("com.nds")
@EnableJpaRepositories("com.nds.repo")
@EntityScan("com.nds.entity")
public class NewzDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewzDataServiceApplication.class, args);
	}
}
