package com.springboot.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("Get API Hello");
		return "Hi Get API";
	}

}
