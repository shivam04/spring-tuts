package com.tutorial.springbootactiveprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@SpringBootApplication
@RestController
public class SpringBootActiveProfileApplication {
	@Value("${spring.application.name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActiveProfileApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String name() {
		return name;
	}
}
