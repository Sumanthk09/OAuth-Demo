package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dbscontroller 
{
	@GetMapping("/home")
	public String homepage()
	{
		return "This is homepage";
	}

}
