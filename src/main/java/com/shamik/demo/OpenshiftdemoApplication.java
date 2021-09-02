package com.shamik.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class OpenshiftdemoApplication {
	
	@RequestMapping("/")
	public String welcome()
	{
		return "Welcome to Openshift";
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftdemoApplication.class, args);
	}

}
