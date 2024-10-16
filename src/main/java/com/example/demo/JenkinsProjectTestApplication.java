package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsProjectTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectTestApplication.class, args);
	}
	
	@GetMapping("/")
	public String helloFromJenkins() {
		return "Hello from Jenkins";
	}

}
