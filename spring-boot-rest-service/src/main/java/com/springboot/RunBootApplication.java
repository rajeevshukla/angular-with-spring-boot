package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot")
public class RunBootApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RunBootApplication.class, args);
	}

}
