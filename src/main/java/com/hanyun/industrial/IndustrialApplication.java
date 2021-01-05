package com.hanyun.industrial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IndustrialApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndustrialApplication.class, args);
	}

}
