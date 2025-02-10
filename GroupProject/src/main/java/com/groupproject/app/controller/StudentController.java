package com.groupproject.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
	@GetMapping("/")
	public String m1()
	{
		return "welcome to student controller";
	}

}
