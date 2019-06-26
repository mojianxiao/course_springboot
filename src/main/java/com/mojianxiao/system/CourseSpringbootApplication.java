package com.mojianxiao.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CourseSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseSpringbootApplication.class, args);
	}
	@RestController
	@RequestMapping("/user")
	public class UserController {
		@GetMapping
		public String getUsers() {
			return "Hello Spring Security";
		}
	}
}
