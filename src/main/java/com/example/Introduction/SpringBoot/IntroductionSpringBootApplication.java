package com.example.Introduction.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IntroductionSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionSpringBootApplication.class, args);
	}

	@GetMapping("/v1/messages")
	public String getHello() {
		return "Hello World";
	}

	@PostMapping("/v1/messages")
	public String postHello() {
		return "Hello World";
	}

	@DeleteMapping("/v1/messages")
	public String deleteHello() {
		return "Hello World";
	}

}
