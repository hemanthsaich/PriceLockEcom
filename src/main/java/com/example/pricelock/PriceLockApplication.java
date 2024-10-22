package com.example.pricelock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PriceLockApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceLockApplication.class, args);
	}

}
