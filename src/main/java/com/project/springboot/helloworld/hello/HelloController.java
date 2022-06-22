package com.project.springboot.helloworld.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "Hello World";
	}
	@GetMapping("/details")
    public Userdetails getDetails()
    {
    	return new Userdetails("test","emp", "pune");
    }
}
