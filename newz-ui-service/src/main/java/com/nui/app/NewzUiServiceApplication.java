package com.nui.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nui")
public class NewzUiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewzUiServiceApplication.class, args);
	}
}
