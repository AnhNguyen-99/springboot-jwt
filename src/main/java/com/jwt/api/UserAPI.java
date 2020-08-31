package com.jwt.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserAPI {
		
	@GetMapping("/helloword")
	public String Hello(){
		return "HelloWord";
	}
}
