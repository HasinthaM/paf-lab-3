package com.paflab3.sliit_paf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SliitPafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SliitPafApplication.class, args);
	}

	@GetMapping("/")
	public String rootEndpoint() {
		String message = "Hello world!";
		return message;
	}

	@GetMapping("/greet")
	public String greetEndpoint() {
		String message = "Welcome to Spring Boot!";
		return message;
	}

	@GetMapping("/greet/{name}")
	public String greetWithNameEndpoint(
			@PathVariable String name,
			@RequestParam(required = false) String message) {

		if (message != null && !message.isEmpty()) {
			return "Hello " + name + "! " + message;
		} else {
			return "Hello " + name + "! Welcome to Spring Boot!";
		}
	}

}
