package com.manfredwind.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String hello() {
		return "Welcome to site developed using Spring boot with Maven for Softmax Solutions, a software company";
	}

}
