package com.paflab3.sliit_paf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
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

}
