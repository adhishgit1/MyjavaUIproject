package com.myexample.adhishWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.adhishWeb.controller","com.adhishWeb.model","com.adhish.repo","com.adhishWeb.service.InfoService"})
@EnableMongoRepositories ("com.server.repository")
public class AdhishWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdhishWebApplication.class, args);
		System.out.println("Adhishsstrat");
	}

}
