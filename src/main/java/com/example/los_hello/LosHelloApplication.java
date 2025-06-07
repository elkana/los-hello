package com.example.los_hello;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class LosHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(LosHelloApplication.class, args);
	}

	// api to get time
	@GetMapping("/time")
	public String getTime() {
		return "Current time is: " + LocalDateTime.now();
	}

}
