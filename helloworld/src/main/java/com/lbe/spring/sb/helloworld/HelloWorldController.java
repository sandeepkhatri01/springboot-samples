package com.lbe.spring.sb.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Run using - mvn spring-boot:run
@RestController
@EnableAutoConfiguration
public class HelloWorldController {

	@RequestMapping("/")
	public String welcome() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}

}
