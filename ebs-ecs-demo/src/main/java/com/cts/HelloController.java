package com.cts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hi() {
		return "Welcome EBS-ECS-Demo.......";
	}
	
	@GetMapping("/hello")
	public String hi1() {
		return "Hello.......";
	}
	
	@GetMapping("/{name}")
	public String hi2(@PathVariable("name") String name) {
		return "Hello  "+name;
	}
}
