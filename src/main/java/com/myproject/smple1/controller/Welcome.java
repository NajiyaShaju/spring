package com.myproject.smple1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@RequestMapping("/welcome")
	public String printWelcome(){
		
		return "Welcome to Baabtra";
	}

}
