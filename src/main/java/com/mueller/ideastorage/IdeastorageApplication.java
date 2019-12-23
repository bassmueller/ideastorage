package com.mueller.ideastorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class IdeastorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdeastorageApplication.class, args);
	}

}
