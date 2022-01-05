package com.dexter.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Kafka Spring Boot", version = "1.0", description = "Kafka with Spring Boot"))
public class KafkaTutorialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTutorialsApplication.class, args);
	}

}
