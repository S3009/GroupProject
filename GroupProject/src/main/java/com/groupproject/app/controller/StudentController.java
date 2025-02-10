package com.groupproject.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.groupproject.app.model.Student;
import com.groupproject.app.service.StudentService;

@RestController 
public class StudentController { 
  
	@Autowired 
	StudentService service;
	
	@PutMapping("/updateStudent")
	public Student updateData(@RequestBody Student so)
	{
		Student ss = service.updateData(so);
		return ss;
	}
}
