package com.example.springCsvToRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringCsvToRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCsvToRestApplication.class, args);
	}

}
