package com.infybuzz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GitHubActionsDemoApplication {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionsDemoApplication.class, args);
	}

}
